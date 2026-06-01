import java.util.Scanner;
import javax.swing.JOptionPane;

public class LoginSystem {
    public static void main(String[] args) {
        String userName = "harry";
        String password = "harry123";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userNameInput = sc.nextLine();
        System.out.println("Enter your password:");
        String passwordInput = sc.nextLine();

        if(userName.equals(userNameInput) && password.equals(passwordInput)){
            JOptionPane.showMessageDialog(null,"Hi, " + userName);
        }if(!userName.equals(userNameInput)){
            JOptionPane.showMessageDialog(null, "Invalid Username! Please try again!");
        }else{
            JOptionPane.showMessageDialog(null, "Incorrect password! Please try again!");
        }
    }
}
