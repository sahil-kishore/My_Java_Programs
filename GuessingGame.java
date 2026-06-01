import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    //Create a guessing game: the computer picks a random number 1-10, and the user guesses until correct.
    //  After each guess, say "too high" or "too low".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int userInput = 0;
        int computerInput = random.nextInt(10)+1;

        while(userInput != computerInput){
        System.out.print("Pick a random number between 1-10: ");
        userInput = sc.nextInt();

           if(userInput > computerInput){
            System.out.println("Too High!");
           }else if(userInput < computerInput){
            System.out.println("Too low");
           }else{
            System.out.println("Bravo! Correct Answer");
           }
        }
        sc.close();
    }
}
