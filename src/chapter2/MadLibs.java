package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]){

        //Ask to input season, number and adjective
        System.out.println("Please input a season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Please input a whole number.");
        int number = scanner.nextInt();

        System.out.println("Please input an adjective.");
        String adjective = scanner.next();




        scanner.close();

        //Output the result
        System.out.println("On a "+ adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }

}
