# Complete Java Guide

### How to install Java and IDE:

####    Step 1: Open CMD & Write below command to know whether java is installed
                         java -version
                         
####    Step 2: Install Java & set Java bin path as an environment variable 
                         https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html
                         
####    Step 3: Install eclipse and set bin path as an environment variable  
                         https://www.eclipse.org/downloads/packages/release/helios/sr1/eclipse-ide-java-developers


###  ⚫ Java JDK, JRE and JVM

### JVM 
    --- JVM (Java Virtual Machine) is an abstract machine that enables your computer to run a Java program.
    
    --- When you run the Java program, Java compiler first compiles your Java code to bytecode. Then, the JVM translates bytecode into native machine code (set of instructions that a computer's CPU executes directly).
    
    --- Java is a platform-independent language. It's because when you write Java code, it's ultimately written for JVM but not your physical machine (computer). Since JVM executes the Java bytecode which is platform-independent, Java is platform-independent.


### JRE
    --- JRE (Java Runtime Environment) is a software package that provides Java class libraries, Java Virtual Machine (JVM), and other components that are required to run Java applications.
    
    --- JRE is the superset of JVM.


### JDK
    --- JDK (Java Development Kit) is a software development kit required to develop applications in Java. When you download JDK, JRE is also downloaded with it
    
    --- In addition to JRE, JDK also contains a number of development tools (compilers, JavaDoc, Java Debugger, etc).


###  ⚫ Java Comments
        --- Single-line comments start with two forward slashes (//).
        --- Multi-line comments start with /* and ends with */.


###  ⚫ Java Variables
        --- String - stores text, such as "Hello". String values are surrounded by double quotes
        --- int - stores integers (whole numbers), without decimals, such as 123 or -123
        --- float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        --- char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        --- boolean - stores values with two states: true or false


###     Final Variables
        --- If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
        Example: 
              final int myNum = 15;
              myNum = 20;  // will generate an error: cannot assign a value to a final variable


###  ⚫ Naming Conventions
###     Packages: 
        --- Names should be in lowercase. With small projects that only have a few packages it's okay to just give them simple (but meaningful!) 
              Example: package pokeranalyzer package mycalculator              
        --- In software companies and large projects where the packages might be imported into other classes, the names will normally be subdivided. Typically this will start with the company domain before being split into layers or features:
              Exampple: package com.mycompany.utilities package org.bobscompany.application.userinterface 
              
###     Classes: 
        --- Names should be in CamelCase. Try to use nouns because a class is normally representing something in the real world:
 class Customer class Account 
 
###     Interfaces: 
        --- Names should be in CamelCase. They tend to have a name that describes an operation that a class can do:
              Example: interface Comparable interface Enumerable               
        --- Note that some programmers like to distinguish interfaces by beginning the name with an "I":
              Example: interface IComparable interface IEnumerable 
 
###     Methods: 
        --- Names should be in mixed case. Use verbs to describe what the method does:
              Example: void calculateTax() string getSurname() 
 
###     Variables: 
        --- Names should be in mixed case. The names should represent what the value of the variable represents:
              Example: string firstName int orderNumber 
        --- Only use very short names when the variables are short-lived, such as in for loops:
                        for (int i=0; i<20;i++) {   //i only lives in here } 
 
###     Constants: 
        --- Names should be in uppercase.
             Example: static final int DEFAULT_WIDTH static final int MAX_HEIGHT 


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


###  ⚫ Java Methods
        --- A method is a block of code which only runs when it is called.
        --- You can pass data, known as parameters, into a method.
        --- Methods are used to perform certain actions, and they are also known as functions.

### Create Method
          public class Main {
              static void myMethod() {
                // code to be executed
              }
          }
          
### Call method
          public class Main {
              static void myMethod() {
              System.out.println("I just got executed!");
              }

          public static void main(String[] args) {
              myMethod();
           }
          }
   
   
### ⚫ Parameters and Arguments
      --- Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.



###  ⚫ Java Scope
        In Java, variables are only accessible inside the region they are created. This is called scope
        --- Method Scope: Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared
        --- Block Scope:A block of code refers to all of the code between curly braces {}.



###  ⚫ Java OOP
        --- OOP is faster and easier to execute
        --- OOP provides a clear structure for the programs
        --- OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
        --- OOP makes it possible to create full reusable applications with less code and shorter development time
        
        

###  ⚫ Java Class, Object, Constructor 
###  Class
     --- User defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.

### Java Class Attributes
          public class numbers {
              int x = 5;
              int y = 3;
           }
         Here x and y are the attributes of the class. We can call it by creating an object of this class.  
         
###  object
     --- Member (also called an instance) of a Java class. Each object has an identity, a behavior and a state.
     
### Constructor 
    --- A block of codes similar to the method. It is called when an instance of the class is created. At the time of calling the constructor, memory for the object is allocated in the memory. It is a special type of method which is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.
        
###  How Constructors are Different From Methods in Java? 
     --- Constructors must have the same name as the class within which it is defined while it is not necessary for the method in Java.
     --- Constructors do not return any type while method(s) have the return type or void if does not return any value.
     --- Constructors are called only once at the time of Object creation while method(s) can be called any number of times.        

###  When is a Constructor called? 
     --- Each time an object is created using a new() keyword, at least one constructor (it could be the default constructor) is invoked to assign initial values to the data members of the same class. 

###  The rules for writing constructors are as follows:
     --- Constructor(s) of a class must have the same name as the class name in which it resides.
     --- A constructor in Java can not be abstract, final, static, or Synchronized.
     --- Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
    
###  Types of Constructors in Java
        1. No-argument constructor: A constructor that has no parameter is known as the default constructor. If we don’t define a constructor in a class, then the compiler creates a default constructor(with no arguments) for the class.
        2. Parameterized Constructor: A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class with our own values, then use a parameterized constructor.
        
###  Need of Constructor
     --- constructors are used to assign values to the class variables at the time of object creation, either explicitly done by the programmer or by Java itself (default constructor).
     

### ⚫ Inheritance: 
       --- one class aquires properties (methods and fields) of another class!
       --- Why? For reusability
       --- How? Using extends keyword

Subclass (derived class or child class)
Superclass (base class or parent class)

###    Types
        Single inheritance
        Multilevel inheritance
        Hierarchical inheritance
        Multiple inheritance (using interface)

###    Important points
        - Subclass can have it's own methods and fields in addition to Superclass's methods and fields
        - Subclass can have only one Superclass. In other words, multiple inheritance is not supported
        - Subclass cannot inherit Superclass's constructor, but it can invoke the constructor
        super keyword
        - Used to differentiate members of Superclass from members of Subclass, if they have same names
        - Used to invoke the constructor of Superclass from Subclass 
        
### ⚫ Access modifiers
        public: Everywhere
        protected: by class in same package or by sub class if outside package
        private: Within class
        default: by class in same package

###  Applicability
        Class: public, default
        Attributes and methods: public, private, protected, default

### Important points
      - Use private for attributes unless there is a good reason not to do so
      - Use public for constants
      - Use protected if you want class members to be accessed by sub classes or by classes in the same package
      - Use private if you think the method will be accessed only within the class        

### ⚫ Encapsulation: 
        --- wrapping up of data under a single unit! The data is protected!

###     How? 
        - By making class attributes (or variables) private
        - By making methods as private

Use getter and setter methods to access private attributes

###     Advantages of Encapsulation
        - Data hiding
        - Flexibility to use variable as read only or write only
        - Reusability


### ⚫ Polymorphism: 
       --- Ability of an object to take many forms!

###    How? 
       --- By Overriding or Overloading methods.

###    Method Overriding
       - Allows a subclass to provide a specific implementation of a method that is already provided by its superclass 
       - Method in subclass should have the same name, same signature, and same return type(or sub-type) as the method in its superclass

###     Method Overloading
       - Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both

###    Polymorphism Types
      - Runtime polymorphism or Dynamic method dispatch: Call resolved at runtime based on the type of the object being referred to at the time the call occurs E.g. Method Overriding
      - Compile time polymorphism: Call resolved at compile time E.g. Method Overloading 

###    Notes
      - final methods cannot be overridden
      - Static methods cannot be overridden (method hiding)


### ⚫ Abstraction: 
       --- Hide details and show only essential information!

###    Abstract class
       --- Provides partial abstraction
       --- Abstract method is declared without implementation
       --- Abstract class cannot be directly instantiated
       --- Sub class can access Abstract class using extends keyword
       --- Sub class must implement all abstract methods i.e. Overriding is compulsory
       --- Abstract class can have parameterized constructor

###    Advantage of Abstract Class
       --- Reduces complexity by hiding implementation
       --- Better viewing
       --- Avoids code duplication and promotes reusability
       --- Increases security by providing only important details to the user

###    Interface
       --- Provides complete abstraction (blueprint! - what to do and not how to do!)
       --- Methods are by default abstract and public
       --- Attributes are by default public, static and final. In other words, attributes are constants
       --- Cannot contain constructor
       --- Must be implemented by other class using implements keyword
       --- Sub class must implement all abstract methods
       --- Sub class can implement multiple interfaces
       --- Java8: Can have default method
       --- Java8: Can have static method

###    Advantages of Abstract Interface
       --- Reduces complexity by hiding implementation
       --- Increases security by providing only important details to the user
       --- Helps achieve multiple inheritanc


### ⚫ Types of Exception in Java
       --- ArithmeticException: It is thrown when an exceptional condition has occurred in an arithmetic operation.  
       
       --- ArrayIndexOutOfBoundsException: It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.
       
       --- ClassNotFoundException: This Exception is raised when we try to access a class whose definition is not found
       
       --- FileNotFoundException: This Exception is raised when a file is not accessible or does not open.
       
       --- IOException: It is thrown when an input-output operation failed or interrupted
       
       --- InterruptedException: It is thrown when a thread is waiting, sleeping, or doing some processing, and it is interrupted.
       
       --- NoSuchFieldException: It is thrown when a class does not contain the field (or variable) specified
       
       --- NoSuchMethodException: It is thrown when accessing a method that is not found.
       
       --- NullPointerException: This exception is raised when referring to the members of a null object. Null represents nothing
       
       --- NumberFormatException: This exception is raised when a method could not convert a string into a numeric format.
       
       --- RuntimeException: This represents an exception that occurs during runtime.
       
       --- StringIndexOutOfBoundsException: It is thrown by String class methods to indicate that an index is either negative or greater than the size of the string
       
       --- IllegalArgumentException : This exception will throw the error or error statement when the method receives an argument which is not accurately fit to the given relation or condition. It comes under the unchecked exception. 
       
       --- IllegalStateException : This exception will throw an error or error message when the method is not accessed for the particular operation in the application. It comes under the unchecked exception.

###    User-Defined Exceptions
       --- Sometimes, the built-in exceptions in Java are not able to describe a certain situation. In such cases, the user can also create exceptions which are called ‘user-defined Exceptions’. 
       
###    The user should create an exception class as a subclass of the Exception class. Since all the exceptions are subclasses of the Exception class, the user should also make his class a subclass of it. This is done as: 
          class MyException extends Exception
          
###    We can write a default constructor in his own exception class. 
          MyException(){}
###    We can also create a parameterized constructor with a string as a parameter.

###    We can use this to store exception details. We can call the superclass(Exception) constructor from this and send the string there. 
          MyException(String str)
          {
            super(str);
          }
          
###    To raise an exception of a user-defined type, we need to create an object to his exception class and throw it using the throw clause, as: 
          MyException me = new MyException(“Exception details”);
            throw me;
            


### ⚫ File operations in Java
       --- Creation of a new file
       --- Opening an existing file
       --- Reading from file
       --- Writing to a file
       --- Closing a file
       --- deleting a file

### Java classes
        FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc.
       --- Create file
       --- read file properties
       --- read and write file using FileReader and FileWriter
       --- read and write file using FileInputStream and FileOutputStream
       --- use relative file path (File seperator)


### ⚫ Java Generics 
###    Java Generic Class
        --- The Java Generics allows us to create a single class, interface, and method that can be used with different types of data (objects).
        
        --- We can create a class that can be used with any type of data. Such a class is known as Generics Class.
        
        Note: Generics does not work with primitive types (int, float, char, etc).
        
 ###   Java Generics Method
       --- Similar to the generics class, we can also create a method that can be used with any type of data. Such a class is known as Generics Method.
       
###    Bounded Types
       --- In general, the type parameter can accept any data types (except primitive types).
       
       --- if we want to use generics for some specific types (such as accept data of number types) only, then we can use bounded types.

###   Advantages of Java Generics
###      1. Code Reusability
         --- With the help of generics in Java, we can write code that will work with different types of data. For example,
                    public <T> void genericsMethod(T data) {...}
             Here, we have created a generics method. This same method can be used to perform operations on integer data, string data, and so on.

###      2. Compile-time Type Checking
            // using Generics
                    GenericsClass<Integer> list = new GenericsClass<>();
              Here, we know that GenericsClass is working with Integer data only. Now, if we try to pass data other than Integer to this class, the program will generate an error at compile time.

###      3. Used with Collections
         --- The collections framework uses the concept of generics in Java. For example,
            // creating a string type ArrayList
                    ArrayList<String> list1 = new ArrayList<>();
            // creating a integer type ArrayList
                    ArrayList<Integer> list2 = new ArrayList<>();
              In the above example, we have used the same ArrayList class to work with different types of data.
              
              
### ⚫  Notes:
      --- Static means that the method belongs to the Main class and not an object of the Main class. 
      --- void means that this method does not have a return value.
      --- If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method.        
