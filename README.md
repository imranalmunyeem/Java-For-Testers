# Complete Java Guide

### How to install Java and IDE:

####    Step 1: Open CMD & Write below command to know whether java is installed
                         java -version
                         
####    Step 2: Install Java & set Java bin path as an environment variable 
                         https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html
                         
####    Step 3: Install eclipse and set bin path as an environment variable  
                         https://www.eclipse.org/downloads/packages/release/helios/sr1/eclipse-ide-java-developers


###  ⚫ Java Comments
        --- Single-line comments start with two forward slashes (//).
        --- Multi-line comments start with /* and ends with */.


###  ⚫ Java Variables
        --- String - stores text, such as "Hello". String values are surrounded by double quotes
        --- int - stores integers (whole numbers), without decimals, such as 123 or -123
        --- float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        --- char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        --- boolean - stores values with two states: true or false


###  ⚫ Final Variables
        --- If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
        Example: 
              final int myNum = 15;
              myNum = 20;  // will generate an error: cannot assign a value to a final variable


###  ⚫ Rules for naming variables
        --- Names can contain letters, digits, underscores, and dollar signs
        --- Names must begin with a letter
        --- Names should start with a lowercase letter and it cannot contain whitespace
        --- Names can also begin with $ and _ (but we will not use it in this tutorial)
        --- Names are case sensitive ("myVar" and "myvar" are different variables)
        --- Reserved words (like Java keywords, such as int or boolean) cannot be used as names

###  ⚫ Java Data Types
        --- Primitive data types: byte, short, int, long, float, double, boolean and char
        --- Non-primitive data types - String, Arrays and Classes


###  ⚫ Difference between primitive and non-primitive data types
        --- Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
        --- Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
        --- A primitive type has always a value, while non-primitive types can be null.
        --- A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
        --- The size of a primitive type depends on the data type, while non-primitive types have all the same size.


###  ⚫ Java Type Casting
        --- Type casting is when you assign a value of one primitive data type to another type. There are two types of casting:
            --- Widening Casting (automatically) - converting a smaller type to a larger type size
                        byte -> short -> char -> int -> long -> float -> double

            --- Narrowing Casting (manually) - converting a larger type to a smaller size type
                        double -> float -> long -> int -> char -> short -> byte



###  ⚫ Java Operators
        --- Arithmetic operators
        --- Assignment operators
        --- Comparison operators
        --- Logical operators
        --- Bitwise operators


###  ⚫ Escape sequences that are valid in Java
            \n	New Line	
            \r	Carriage Return	
            \t	Tab	
            \b	Backspace	
            \f	Form Feed
            

###  ⚫ Java Math
        --- Math.max(x,y)
            The Math.max(x,y) method can be used to find the highest value of x and y
        
        --- Math.min(x,y)
            The Math.min(x,y) method can be used to find the lowest value of x and y
       
        --- Math.sqrt(x)
            The Math.sqrt(x) method returns the square root of x
            
        --- Math.abs(x)
            The Math.abs(x) method returns the absolute (positive) value of x    
            
        --- Random Numbers
            Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)  
            To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula:
                    int randomNum = (int)(Math.random() * 101);  // 0 to 100

###  ⚫ Java Conditions and If Statements
        Less than: a < b
        Less than or equal to: a <= b
        Greater than: a > b
        Greater than or equal to: a >= b
        Equal to a == b
        Not Equal to: a != b
        
###     Java has the following conditional statements:
        Use if to specify a block of code to be executed, if a specified condition is true
        Use else to specify a block of code to be executed, if the same condition is false
        Use else if to specify a new condition to test, if the first condition is false
        Use switch to specify many alternative blocks of code to be executed


###  ⚫ Java Switch
        --- The switch expression is evaluated once.
        --- The value of the expression is compared with the values of each case.
        --- If there is a match, the associated block of code is executed.
        --- When Java reaches a break keyword, it breaks out of the switch block. This will stop the execution of more code and case testing inside the block.
        --- The default keyword specifies some code to run if there is no case match
        --- If the default statement is used as the last statement in a switch block, it does not need a break.
        
###    Syntax:
          switch(expression) {
            case x:
              // code block
            break;
            case y:
              // code block
            break;
            default:                         
              // code block
            }

###  ⚫ Loops
###        While Syntax:
              while (condition) {
                // code block to be executed
               }

###        Do-While Syntax:
              do {
                // code block to be executed
              }
              while (condition);
              
###        For Syntax:
              for (statement 1; statement 2; statement 3) {
                // code block to be executed
              }
              
###        For-Each Syntax:
              for (type variableName : arrayName) {
                // code block to be executed
              }
              
###  ⚫ Java Break and Continue
        --- The break statement can also be used to jump out of a loop.
        --- The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
