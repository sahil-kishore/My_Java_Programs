import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter first element: ");
        String x = sc.nextLine();
        System.out.println("Enter first element: ");
        String y = sc.nextLine();
        String temp;

        System.out.println("====Before Swapping:====");
        System.out.println("x: "+x);
        System.out.println("y: "+x);

        temp = x;
        x = y;
        y = temp;

        System.out.println("====After Swapping:====");
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        }
    }
}
