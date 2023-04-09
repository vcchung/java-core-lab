# Java Core Lab

## Inner class
    * Non-static inner class
        * outerclass cannot access inner class private field
        * innerclass can acccess outer class private field
        * should use when innerClass need to access the private field of outer class
        * Common example: Iterator inside collection, Map.Entry inside Map
    * Static inner class
        * common example: Helper class or Enum only related to the class