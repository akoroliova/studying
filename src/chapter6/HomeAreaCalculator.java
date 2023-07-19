package chapter6;

/*
 * Write a class that creates instances of the Rectangle class (utilizes Rectangle class) to find the
 * total area of two rooms in a house.
 */

public class HomeAreaCalculator {

    public static void main(String[] args){

        /* *******************
         * RECTANGLE 1
         ********************/

        //Create instance of Rectangle class (a 'room1' object)
        Rectangle room1 = new Rectangle(); //creating an instance of an object 'room1' as 'new' followed by
        //a constructor (we specify the one with the specific parameter list that we want)
        room1.setWidth(25); //access object 'room1''s method by using '.' operator
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        /* *******************
         * RECTANGLE 2
         ********************/

        //Create instance of Rectangle class (a 'room2' object)
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }
}