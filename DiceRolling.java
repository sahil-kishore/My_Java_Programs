import java.util.Random;
import javax.swing.JOptionPane;
public class DiceRolling {
    //Simulate rolling two dice 1000 times and count how many times you roll a 7. Print the percentage.
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Two Dices is rolling: ");
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        JOptionPane.showMessageDialog(null, "1st dice : " + dice1 + " , 2nd dice : " + dice2);

    }
}
