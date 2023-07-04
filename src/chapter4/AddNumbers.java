package chapter4;
import java.util.Scanner;
/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
* Purpose of DO WHILE LOOP - run this at least one time
* DO WHILE LOOP doesn't check the condition until AFTER the loop is run one time, so there's no condition after 'do' in braces, and so the condition goes in braces after 'while',
* the condition goes without operators because it's either 'true' or 'false anyway' ('again' is a boolean).
 */
public class AddNumbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over? True or False");
            again = scanner.nextBoolean();

        } while(again);

        scanner.close();
    }
}