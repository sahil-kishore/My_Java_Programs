import java.util.*;
public class Test {
    // Create a program that randomly picks one of 5 responses 
    // ("Yes", "No", "Maybe", "Ask later", "Definitely") when the user types a question.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 =  sc.nextInt();
        int n2 = sc.nextInt();

        int sum = 0;
        for(int i = n1 ; i <= n2 ; i++){
            sum += i;
        }
        System.out.println("Sum of two numbers between " + n1 + " and " + n2 + " : " + sum);
        sc.close();
    }
    
}
