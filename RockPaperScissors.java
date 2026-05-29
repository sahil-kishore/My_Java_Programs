import java.util.*;

class RockPaperScissors{
    public static void main(String[] args) {
        //user input
        //computer input
        //condition - tie, win, lose
        //play again input 
        //exit 

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String userInput;
        String computerVal;
        String[] arr = {"rock", "paper", "scissor"}; // computer input
        String playAgain = "yes";
        
        do{
        System.out.println("Choose (Rock, Paper, Scissors) :");
        userInput = sc.nextLine().toLowerCase();
        if(!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissors")){
            System.out.println("Invalid Choice!");
            continue;
        }
        computerVal = arr[random.nextInt(3)];
        System.out.println("Computer chose: "+ computerVal);

        if(userInput.equals(computerVal)){
            System.out.println("It's a tie!");
        }

        if((userInput.equals("rock") && computerVal.equals("paper")) 
            || (userInput.equals("paper") && computerVal.equals("rock")) 
            || (userInput.equals("scissors") && computerVal.equals("paper"))
        ){
            System.out.println("You win!");
        }else{
            System.out.println("Computer wins!");
        }

        System.out.println("Do you want to play again?(yes/no)");
        playAgain = sc.nextLine().toLowerCase();


        }while(playAgain.equals("yes"));


        System.out.println("Thanks for playing!");
        sc.close();
    


    }
}