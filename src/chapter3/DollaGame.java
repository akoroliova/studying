package chapter3;

import java.util.Scanner;

public class DollaGame {
/*
        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");
*/
    public static void main(String args[]) {

        // 1. Initialize values we know:
        double penny = 1;
        double nickel = 5;
        double dime = 10;
        double quarter = 25;
        double oneDollar = 100;

        // 2. Get unknown values:
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies would you like?");
        double penniesCount = scanner.nextDouble();
        System.out.println("How many nickels would you like?");
        double nickelsCount = scanner.nextDouble();
        System.out.println("How many dimes?");
        double dimesCount = scanner.nextDouble();
        System.out.println("How many quarters?");
        double quartersCount = scanner.nextDouble();
        scanner.close();

        // 3. Count up the value of all input and compare result to dollar, output results:
        // как только насчитает 101+ цент, пусть останавливается и говорит, что перебор ----- не знаю как(((
        //а еще тут можно без скобок совсем, я не знала:
        double sum = (penniesCount * penny + nickelsCount * nickel + dimesCount * dime + quartersCount * quarter);

        if (oneDollar == sum) {
            System.out.println("WIN!");
        }
        else if (oneDollar < sum) {
            System.out.println("TOO MUCH! You went over " + (sum - oneDollar) + " cents");
        }
        else if (oneDollar > sum) {
            System.out.println("NOT ENOUGH! You went under " + (oneDollar - sum) + " cents");
        }
    }
}