package com.OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{
            String name= "Abi";
            if (name.equals("Abi")){
                throw  new MyException("name is Abi" );
            }
            int c = a/b;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (MyException e){
            System.out.println("My Exception");
        }
        catch (Exception e){
            System.out.println(" Super exception");
        }
        finally {
            System.out.println("This will always execute");
        }


    }
}
