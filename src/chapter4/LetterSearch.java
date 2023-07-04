package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter ‘A’.
 * We're going to loop through the input text to search for the letter 'A'.
 */
public class LetterSearch {

    public static void main(String[] args){

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false; // false - cuz the letter has not been found yet

        //Search text for letter A
        for(int i=0; i<text.length(); i++){   //with this we say 'keep going until you get to the end of string'
            char currentLetter = text.charAt(i); //on the first iteration the program will check the first char, then second, etc
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }

        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}