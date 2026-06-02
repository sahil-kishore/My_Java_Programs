import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = 0;
        int i = 1;

        System.out.println("Table of " + num + " :");
        System.out.println("--------------");
        while(i <= 10){
            result = num * i;
            System.out.println(num + " x " + i + " = " + result);
            i++;
        }
    }
}
