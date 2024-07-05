//import com.sun.tools.jdeprscan.scan.Scan;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){


        //take input number make that maximum range
        //initialize mystery number to be a random number from that range
        //after every guess, print -too small -too large or -correct guess
        //when game ends, display how many tries it took. so put counter in beginning
        //a number that is put through consecutively, should only count as one singular guess


        int randomNum = 0;
        boolean numGuessed = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number:");
        int maxRange = scanner.nextInt();

        HashSet<Integer> guessesSet = new HashSet<Integer>();

        for (int i = 0; i < maxRange; i++){
            randomNum = (int) (Math.random() * maxRange);
        }

        System.out.println("The mystery number is between 1 and " + maxRange);

        while (!numGuessed){
            System.out.println("Try to guess my number.");
            int userGuess = scanner.nextInt();
            if (userGuess == randomNum){
                System.out.println("Congratulations, you got it! It was " + randomNum);
                System.out.println("Goodbye.");
                numGuessed = true;
            } else if (userGuess < randomNum){
                System.out.println("Too small!");
                guessesSet.add(userGuess);
                System.out.println("Guesses: " + guessesSet.size());
            } else if (userGuess > randomNum){
                System.out.println("Too large!");
                guessesSet.add(userGuess);
                System.out.println("Guesses: " + guessesSet.size());
            }
        }








    }
}
