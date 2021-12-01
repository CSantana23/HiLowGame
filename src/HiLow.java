import java.util.Random;
import java.util.Scanner;

//adding comments to be able to upload this doc
public class HiLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        do {
            int theNumber = (int)(Math.random() * 100 + 1);
            int guess = 0;
            while(guess != theNumber) {
                System.out.println("Guess a number between 1 and 100");
                guess = scan.nextInt();
                System.out.println("You guessed " + guess + ".");
                if(guess < theNumber) {
                    System.out.println("The number you guessed " + guess + " was too low");
                } else if (guess > theNumber) {
                    System.out.println("The number you guessed " + guess + " was too high");
                } else {
                    System.out.println("You guessed correctly!!");
                }
            }
            System.out.println("Would you like to play again?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
    }
}
