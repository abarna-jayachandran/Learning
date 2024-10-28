package com.OOPS.Enum;

public class Main {

        enum Week{
            Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
            //these are enum constants
            //public final and static
            //since its final you cannot create  child enums
            // type of all constant is week
        }
    public static void main(String[] args) {
            Week week;
            week = Week.Friday;

//            /*for(Week days:Week.values()){
//                System.out.println(days);//Prints all variables
//
//            }*/
        System.out.println(week.ordinal());//print position of Friday so o/p is 5
    }
}
