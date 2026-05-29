import java.util.Scanner;

public class newlineLeftover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        sc.nextLine(); /*
        Add an extra scanner.nextLine() call immediately after nextInt()
        to consume the leftover newline: */

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Age:"+age);
        System.out.println("Name:"+name);
    }
}
