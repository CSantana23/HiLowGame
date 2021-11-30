import java.util.Random;
import java.util.Scanner;

//adding comments to be able to upload this doc
public class HiLow {
    public static int randomNumber() {
        Random r = new Random();
        int low = 1;
        int high = 100;
        int result = r.nextInt(high - low) + low;
        return result;
    }

    public static int userInput() {
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        return guess;
    }

    //if the number is equal return 0, less return 1, greater, return 2 else return -1
    public static int userGuess(int userNumber, int randomNumber) {
        if (userNumber == randomNumber) {
            return 0;
        } else if (userNumber < randomNumber) {
            return 1;
        } else if (userNumber > randomNumber) {
            return 2;
        }
        return -1;
    }

    public static String startGame() {
        System.out.println("Want to play a guessing game");
        System.out.println("press Y and hit enter to continue or press N and hit enter to exit");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = startGame();
        if(userInput.equals("Y") || userInput.equals("y")) {
            int randomNumber = randomNumber();
            System.out.println(randomNumber);
            System.out.println("Guess a number");
            int userGuess = scanner.nextInt();
            int result = userGuess(userGuess,randomNumber);
            if(result == 0) {
                System.out.println("That is correct!! The number is " + randomNumber);
                System.out.println("Would you like to play again?");
                System.out.println("Press Y and hit enter");
                Scanner scanner1 = new Scanner(System.in);
                String responseToPlayAgain = scanner1.nextLine();
                System.out.println(responseToPlayAgain);
                if(responseToPlayAgain.equals("Y") || responseToPlayAgain.equals("y")){
                    System.out.println("Let's start over");
                    startGame();
                } else {
                    System.out.println("See you later");
                }

            }
        } else {
            System.out.println("Okay thank you come play next time");
        }
    }
}
