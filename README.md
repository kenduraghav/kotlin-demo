# Learn Kotlin by example

## A Simple REST API Demo

This is a simple rest api application that saves messages to an in-memory database using kotlin. To explore kotlin langauage features
and learn kotlin by doing.

### Things learned along the way:
 - In kotlin, for a class that does not have any members like (functions or properties), we can omit the class body (`{}`).
 - To passs varargs similar to (String ...args), in kotlin, **use spread operator(*)**  For example `(*args)`.
 - If a function contains only one statment then we can omit the method body `({})`  -  which is know as **Single-expression
   function**. Here is an example, based on the result statement after `=` the return type is inferred automatically in the
   below example, here it is `String`
     ```
      @GetMapping("/")
      fun index(@RequestParam("name") name: String) = "Hello, $name!"     
     ```
  - **String Templates** - a conveinent way to concatenate Strings. A String literal combined with expressions.
  - **Data Class** - A similar to `record` (though data classes exists even before `record`) in java. These are DTOs.
    -  `val id:String` - `val` keyword here it is read-only.
    -  `var id:String` - here it is mutable, using `var`  keyword.
  - **Nullable/Non-nullable references**
      - Nullable references - the value can be nullable  example `val id: String?` - `?` -represents this could be null.
      - Non-nullable references - value can never be null example `val id: String`.
  - **Kotlin Collections** - sets, lists, and map.
      - readonly and mutable collection types
      - readonly: `listOf()`
      - mutable:  `mutableListOf()` 
       

   
