package chapter4;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class AverageTestScores {

    public static void main(String[] args){

        //Initialize what we know
        int numberOfStudents = 5;
        int numberOfTests = 3;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for(int i=0; i< numberOfStudents; i++){

            double total = 0;
            for(int j=0; j<numberOfTests; j++){ // 'j' is different sentinel, it controls this inner loop, while 'i' controls the outer loop
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble(); //we need to declare 'total' variable BEFORE we get inside the loop so it doesn't get overwritten inside the loop
                total = total + score; //so whatever they put in, will be added to 'total'
            } //so this loop will continue 3 times until it's fulfilled

            double averageForStudent = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + averageForStudent);

        } //and this loop will repeat for each student until done


        scanner.close();
    }
}