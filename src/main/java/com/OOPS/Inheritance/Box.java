package com.OOPS.Inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }
        //cube
        Box(double side){
            this.length=side;
            this.height=side;
            this.width=side;

        }
         Box(double length,double height,double width){

             this.length = length;
             this.height = height;
             this.width = width;
         }
         Box( Box old){

             this.length = old.length;
             this.height = old.height;
             this.width = old.width;

         }
         public void Information(){
            System.out.println("Running the Box");
         }
    }

