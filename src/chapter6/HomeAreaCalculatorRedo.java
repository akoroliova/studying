package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in); //'Scanner' is a class (already defined in java),
    //'scanner' is an object name,
    //we're using 'new' to instantiate this,
    //and we're calling a constructor 'Scanner' that takes in '(System.in)' argument.

    public static void main(String[] args){ //'main' has to be 'static' in java. It has no state (args/params).
        //'static' is used when you don't want to create a new instance of that class,
        // but yet you want to access the things inside of it. So it has no state.
        // Static methods are ones that can be called without instantiating its class.
        // They do not have knowledge of state within the class


        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo(); //here we've instantiated [?] єто создание обьекта/инстанса
        // inside 'main' class body, so that we can keep state and then call the other methods,
        // because there can be no such thing as state (assigning values?) in static method
        // (we can only call to a static method itself)
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        calculator.scanner.close();

    }

    public Rectangle getRoom(){ //We don't limit our methods to primitive return types (static, void, final..),
        // nor the parameters that they accept. In this case this method 'getRoom' won't return primitive return type,
        // it's going to return 'Rectangle' object, that's what we're expecting from 'getRoom'.
        //Unlike methods (which return only one value), objects can return lots of different data:

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width); //we can instantiate this Rectangle right inside the 'return' statement.
        //'return' has to be the very last line in body.
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

}