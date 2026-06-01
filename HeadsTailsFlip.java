import java.util.Random;
public class HeadsTailsFlip {
    public static void main(String[] args) {
        Random random = new Random();
        // Write a program that simulates flipping a coin 5 times and prints "Heads" or "Tails" each time.
        int coin;
        for(int i = 1 ; i <= 5 ; i++){
            coin = random.nextInt(2);
            if(coin == 0){
                System.out.println("Flip " + i + " :" + "Heads");
            }else{
                System.out.println("Flip " + i + " :" + "Tails");
            }
            
        }
    }
}
