package chapter3;

import java.util.Scanner;

/*
I Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {

    public static void main(String args[]){
        //Initialize the known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int salesCount = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        //inside the parentheses is a condition which needs to be evaluated (to true or false)
        //so it must be resolved to boolean value (true/false)
        //everything inside the if's braces {} will be executed only if everything in () resolves to true
        if(salesCount >= quota){
            //here we'll UPDATE the salary variable, i.e. "take SALARY memory location (to the left of equation)
            //and update it with following values: salary+bonus
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);


    }

}
