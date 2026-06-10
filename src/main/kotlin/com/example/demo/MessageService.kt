package com.example.demo

import org.springframework.jdbc.core.simple.JdbcClient
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class MessageService(private val jdbcClient: JdbcClient) {

    fun findMessages(): List<Message> {
        return jdbcClient
            .sql("select * from messages")
            .query { response, _ ->
                Message(
                    response.getString("id"),
                    response.getString("text")
                )
            }
            .list()
    }

    fun findMessagesById(id: String): Message? {
        return jdbcClient
            .sql("select * from messages where id=:id")
            .param("id",id)
            .query { response, _ ->
                Message(
                    response.getString("id"),
                    response.getString("text")
                )
            }.single()
    }


    fun save(message: Message): Message {
        val id = message.id ?: UUID.randomUUID().toString()
        jdbcClient
            .sql("insert into messages values (?,?)")
            .param(1, id)
            .param(2, message.text)
            .update()
        return message.copy(id = id)
    }
}