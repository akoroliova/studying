package chapter5;

import java.util.Scanner;

/*
 * OUR FIRST METHOD
 * Write a method that asks a user for their name, then greets them by name.
 */
public class Greetings { //methods have to be contained within a scope of a class (order of methods withing a class is not important))

    public static void main(String[] args){

        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        greetUser(name); //here we call the 'greetUser' method (from below) by it's name 'name'. Otherwise the 'greetUser' method won't be executed at all ->
    }

    public static void greetUser(String name){ //it's a separate method called 'greetUser', it's a separate task, name of method by convention should start with verb

        System.out.println("Hi there, " + name);
    }
}