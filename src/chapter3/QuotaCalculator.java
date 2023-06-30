package chapter3;
import java.util.Scanner;

/*
 * IF ELSE statement
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main(String args[]){

        // 1. Initialize values we know:
        int quota = 10;

        // 2. Get unknown values:
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int salesCount = scanner.nextInt();
        scanner.close();

        // 3. Make a decision on the path to take:
        //if 'if' has only one statement inside curly brackets - we can remove brackets as well
        if(salesCount >= quota){
            System.out.println("Congrats! You've met your quota!");
        }
        //notice that else doesn't have a parentheses () condition, because if' s condition works both for if and else
        else{
            int salesShort = quota - salesCount;
            System.out.println("You didn't make your quota. You were " + salesShort + " sales short!");
        }

        // 4. Output

    }

}
