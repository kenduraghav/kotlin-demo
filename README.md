# Learn Kotlin by example

## A Simple REST API Demo

This is a simple rest api application that saves messages to an in-memory database using kotlin. To explore kotlin langauage features
and learn kotlin by doing.

### Things learned along the way:
 - In kotlin, for a class that does not have any members like (functions or properties), we can omit the class body (`{}`).
 - To passs varargs similar to (String ...args), in kotlin, **use spread operator(*)**  For example `(*args)`.
 - If a function contains only one statment then we can omit the method body `({})`  -  which is know as Single-expression
   function.Here is an example
     ```@GetMapping("/")
      fun index(@RequestParam("name") name: String) = "Hello, $name!"
     ```
  
   
