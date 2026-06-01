import java.util.Random;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        
        Random random = new Random();

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$";
        StringBuilder password = new StringBuilder();
        int passwordLength = 12;

        for(int i = 0; i < passwordLength; i++){
            int index = random.nextInt(str.length());
            password.append(str.charAt(index));
        }
        System.out.println("Your password is : " + password.toString());
    }
}
