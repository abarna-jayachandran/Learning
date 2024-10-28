package com.OOPS;

public class Basic {
    public static void main(String[] args) {
        //store 5 roll num
        int[] rollnum= new int[5];
        //store 5 student name
        String[]studentName= new String[5];
        //store student data  of 5 students as roll num , name , marks
        int[] rno = new int[5];
        String[] name=new String[5];
        float[] marks = new float[5];
        //but I want single element contains the above 3 things , here comes the oops concept
        //A class is a named group of properties and function
        // In class we can combine these 3 roll num , name and mark into a single unity
        //A convention of  class name will start with capital letter
        /*I want other datatype called student as your ouwn datatype, you make it own
        how can you create your own dataType ? using classes*/
      // Student[] student = new Student[5];
       // Student abi;

        //create a class (group of properties and functions)
        class Student{
            int rno;
            String name;
            float marks ;
        }
        //real life example
        //A car is real example of class
        //properties of car class
        // engine, seat,price
        // maruti , ferrari,audi
        /* maruti , ferrari , audi they all follow the same procedure(engine,price,seat) but the
        * values of properties are different like
        * maruti -petrol engine, size is small  ,4 seat
        * ferrari- diesel engine, size is may big,2 seat
        * audi -electric vehicle engine , size is  medium, 4 seat
        * maruti ferrari, audi, are known as objects
        * a class is a template of an object-logical construct
        * an object is an instance of a class-physical reality// occupies space in memory
        * when you create an object of a class means  you are actually creating an instance of a class
        * what is instance? instance means physical stuff of the class-
        * object have 3 essential properties such as
        *  1. state of the object 2.identify of the object 3.behaviour of the object
        * 1.state of the object means , its value from its datatype
        * 2.identity of the object means,where the value is stored in the memory
        * 3.Behaviour of the object means , effect of the datatype operations
        * objects are stored in the heap memory
        * reference variables are stored in the stack memory */
        //******************************************************//
        // *how do we access now like student 1 name , student 2 percentage sudent 3 name
       // we can call this by using dot operator
        //the dot operator(formally we will call a dot as a separator in java) basically links the Student 1 and the properties like marks ,name, roll no
        // variable inside the objects are instance variables
        /* new keyword
        class student{
         int rno;
          String name;
          float marks
          student  student1;// declaring the reference variable(student1) to the object
          not creating an object
          it is in stack memory
          if the reference variable is not initialized , when you try to print you will get null values
          //creating an object as below
          student student1 = new student(); when you create an object of a class it means instantiated// left side compile time // right side run time
          // new operator--> dynamically allocates--> allocates the memory at run time  and returns the reference to it which is student1 variable
          }
         */
      //just declaring
        Student abi = new Student();
        System.out.println(abi);


    }
}
