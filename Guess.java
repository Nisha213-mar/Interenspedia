

import java.util.*;

public class Guess {

    public static void guessingNumberGame() {
        Scanner in = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int k = 3;
        int guess, i;
        System.out.println("A number is chosen"
                + " between 1 to 100."
                + "Guess the number"
                + " within 3 trials.");
        for (i = 0; i < k; i++) {
            System.out.println("Guess the Number ");
            guess = in.nextInt();
            
            if( guess == number) {
                        System.out.println("Congratulations!" + " You guessed the number.");
                    break;
            }
                   else if (number > guess && i != k - 1){
                        System.out.println(
                                "The number is "+ "greater than " + guess+"guess the greater one");
                 
                    }
            
                    else if (number < guess && i != k - 1){
                        System.out.println(
                                "The number is"+ " less than " + guess+"guess the lesser one");
                    
                    }
                }

            

      
        if (i == k) {
            System.out.println(
                "You have exhausted"
                + " K trials.");
 
            System.out.println(
                "The number was " + number);
        }
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}