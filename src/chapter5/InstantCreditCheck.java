package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Variables are only valid within the scope in which they were defined (curly braces).
 *
 * Write an ‘instant credit check’ program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 *
 * METHOD, as it's one task, can only return one value to main method
 */
public class InstantCreditCheck {

    //variables are only valid (known) within the scope of which they were defined (curly braces),
    //so we're declaring the variables above the methods here in class body (making them global).
    //Because the method is static, the declared variables need to be static as well.
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //Get what we don't know. Call to the lower methods to get data:
        double salary = getSalary(); //the value will return here, so we declare the variable here to store the returned info
        int creditScore = getCreditScore();

        scanner.close(); //we're closing this in the main method, because it will be anyway used in the methods below and close only after that

        //Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary); //we read it in to this variable from method below, and then use it in 'notifyUser' task:

        //Notify the user
        notifyUser(qualified);

    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary; //even if we have this method and it's getting the data, - we have to call it from main method in order for these statements to execute
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary){ //in brackets, we specify the parameters (creditScore and salary),
        // because we want this method to specify that data, and that data is given to it by main method after calculations),
        // however the 'creditScore' and 'salary' variables here are not the same as in main method, they're in different scopes but they correspond to each other accordingly.
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You've been approved.");
        }
        else{
            System.out.println("Sorry. You've been declined");
        }
    }
}