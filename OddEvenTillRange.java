import java.util.Scanner;

public class OddEvenTillRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();

        System.out.println("Odds numbers: ");
        int i = 1;
        while(i < n){ //odd numbers
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }

        System.out.println("Even numbers: ");
        int j = 1;

        while(j < n){
            
            if(j % 2 == 0){
                System.out.println(j);
            }
            j++;
        }

    }
}
