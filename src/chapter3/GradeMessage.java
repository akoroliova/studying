package chapter3;
import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement, print out a message letting them know how they did.
 *
 * IF - ELSE IF checks the condition to be true (inside a range of values!), whereas the SWITCH statement checks for equality (like, if actual value is equal to expected value).
 */

public class GradeMessage {

    public static void main(String args[]){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
                //we also can do a 'fallthrough' with not using 'break', in such case program will execute each 'case' until it meets 'break',
                //and so only the last action will be performed.
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            //a default case is required to handle anything else inputted besides the abovementioned:
            default:
                message = "Error. Invalid grade";
                break;
        }

        System.out.println(message);

    }
}