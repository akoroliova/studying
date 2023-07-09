package chapter4;

import java.util.Random;

/*
 * generate a Random number between 1 – 6
 * put this int into variable
 * increment numbers until maxFieldsCount = 20  OR until maxRolls = 5
 * if maxFieldsCount > 20 while maxRolls <= 5 then user loses
 * if maxFieldsCount < 20 while maxRolls <= 5 then user loses
 * stop whenever maxRolls > 5
 */
public class RollaGame2 {
    public static void main(String[] args) {

        //Initialize variables we know
        int maxSpacesCount = 20;
        int maxRolls = 5;
        int currentSpace = 0;
        Random random = new Random();

        //After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
        /*System.out.println("Roll #1: You've rolled a " + currentDie + ". You are now on space " + currentSpace + " and have " + (maxFieldsCount - currentSpace) + " more to go.");*/

        //loop 4 more times OR until generatedSum >= 20 (NESTED LOOP)
        for (int i = 0; i < maxRolls; i++ /*i = i + 1*/) {
            int currentDie = random.nextInt(6) + 1;
            currentSpace = currentSpace + currentDie;
            System.out.println("Roll #" + (i + 1) + ": You've rolled a " + currentDie + ". You are now on space " + currentSpace + " and have " + (maxSpacesCount - currentSpace) + " more to go.");

            //However, if the user gets to 20 before 5 rolls, end the game - they’ve won. If they are greater than or less than 20 spaces exactly, they lose.
            if ((currentSpace >= maxSpacesCount && i < (maxRolls - 1)) || (currentSpace == maxSpacesCount))  {
                System.out.println("YOU WON");
                break;
            }

            if (i == maxRolls - 1) {
                System.out.println("GAME OVER");
            }

        }

    }

}
