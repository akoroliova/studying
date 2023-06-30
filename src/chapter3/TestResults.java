package chapter3;

import java.util.Scanner;

/*
 * IF - ELSE IF
 * With if-else-if statements, multiple conditions must be specified.
 * Display the letter grade for a student based on their test score.
 * Which branches of an if-else-if statement are executed? The first one that is true.
 * When is it ideal to use an if-else-if statement? When there are more than two possible paths.
 * When declaring a variable, you are not required to also initialize it with a value within the same declaration statement.
 */
public class TestResults {

    public static void main(String args[]){

        // 1. Get the test score
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        // 2. Determine the letter grade.
        // 'char' data type values use single quotation marks, while 'String' data type values use double quotation marks.
        char grade;

        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if(score < 80){
            grade = 'C';
        }
        else if(score < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}