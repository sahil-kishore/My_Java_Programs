import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int result = 1;

        System.out.print("Factorial of " + num + " : ");
        int i = 1;
        while(i <= num){
           result *= i;
           i++;
        }
        System.out.print(result);
    }
}
