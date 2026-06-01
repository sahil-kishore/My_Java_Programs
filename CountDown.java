import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the countdown begin number:");
        int count = sc.nextInt();
        System.out.println("-------------------");
        while(count >= 0){
            if(count == 0){
                System.out.println("Ready....Blast off!!");
            }else{
                System.out.println(count);
            }
            count--;
        }

    }
}
