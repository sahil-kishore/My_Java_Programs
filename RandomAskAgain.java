import java.util.Random;
import java.util.Scanner;
/*
Create a program that randomly picks one of 5 responses 
("Yes", "No", "Maybe", "Ask later", "Definitely") when the user types a question.
 */
public class RandomAskAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int response;
        String question;
        String askAgain = "yes";
        
        do{
            System.out.println("Enter your question: ");
            question = sc.nextLine();
            System.out.println("----------------------");
            response = random.nextInt(5)+1;

            System.out.println("Your response = "+ question);
            System.out.print("Computer response: ");

            if(response == 1){
                System.out.println("Yes");
            }else if(response == 2){
                System.out.println("No");
            }else if(response == 3){
                System.out.println("Maybe");
            }else if(response == 4){
                System.out.println("Ask Later!");
            }else{
                System.out.println("Definitely");
            }
            System.out.println("----------------------");
            System.out.println("Do you want to ask again?(yes/no)");
            askAgain = sc.nextLine();
            System.out.println("----------------------");
            
        }while(askAgain.equalsIgnoreCase("yes"));

        sc.close();
    }
}
