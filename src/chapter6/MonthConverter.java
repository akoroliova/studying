package chapter6;

public class MonthConverter {

    public static void main(String[] args){
        System.out.println(Month.getMonth(2)); //when we have a static method within a class,
        //there's no need to instantiate that class in order to access them.
        System.out.println(Month.getMonth("January")); //here we're calling a second method
    }
}