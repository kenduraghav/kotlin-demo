package com.example.demo

import org.springframework.data.repository.findByIdOrNull
import org.springframework.jdbc.core.simple.JdbcClient
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class MessageService(private val repository: MessageRepository) {

    fun findMessages(): List<Message> = repository.findAll().toList()

    fun findMessagesById(id: String): Message? = repository.findByIdOrNull(id)

    fun save(message: Message): Message = repository.save(message)
}