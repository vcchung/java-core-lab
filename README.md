# Java Core Lab

## Inner class
    * Non-static inner class
        * outerclass cannot access inner class private field
        * innerclass can acccess outer class private field
        * should use when innerClass need to access the private field of outer class
        * Common example: Iterator inside collection, Map.Entry inside Map
    * Static inner class
        * common example: Helper class or Enum only related to the class
    * Anonymous inner class
        * no name, to be used once
        * common usage: implement Runnable, implement event handler
## Singleton
    * singleton can be implemented using check check locking with lazy init factory method
        * but you can break it by serialized and deserialized the class, and using reflection to change contrctor to public and create new object.
    * but enum is better
        * easier and JVM guarantee unique
