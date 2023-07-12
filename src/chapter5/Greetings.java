package chapter5;

import java.util.Scanner;

/*
 * OUR FIRST METHOD
 * Methods (in other languages - functions, modules..) are subtasks within a class.
 * Methods have to be contained within a scope of a class (order of methods within a class is not important)
 *
 * Write a method that asks a user for their name, then greets them by name.
 */
public class Greetings {


    public static void main(String[] args){
        //'public' is an access modifier, meaning any code from any class can use this method (other types are 'private', 'protected',..). It's NOT required for method declaration.
        //'static' is a non-access modifier (final, abstract, synchronized).
        //'void' shows which data type this method returns to the code that calls it. If doesn't return any value - then 'void'. If returns int - then 'int'. And so on.
        //if return type is anything than 'void', then the method should have a 'return' statement to return a value of method's return type (int, double,..).
        //'main' is the name of method, by convention it should begin with a verb (like 'calculateSum'), or with a question (for booleans, e.g. 'isSumNegative').
        //'(String[] args)' is a parameter list which can be empty if no external data is needed to complete this method's task.
        //Parenthesis holds a list of all the data (parameter list) that should be supplied to this method.
        //'main(String[] args)' is a method's signature (consists of a method's name and a parameter list).
        //Curly braces hold method's body (zero or more statements which are to be executed should this method be called).
        //A method doesn't know of anything except the parameters(=arguments) which were passed into it. Суть метода - что-то посчитать и вернуть результат.

        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        greetUser(name); //'(name)' is an argument list. here we call the 'greetUser' method (from below) by its name 'name' Otherwise the 'greetUser' method won't be executed at all.
    }

    public static void greetUser(String name){ //it's a separate method called 'greetUser', it's a separate task

        System.out.println("Hi there, " + name);
    }
}