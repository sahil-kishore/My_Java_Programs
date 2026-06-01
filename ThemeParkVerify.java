import java.util.*;
public class ThemeParkVerify {
    public static void main(String[] args) {
        // A ride at a theme park requires: height >= 120cm AND age >= 10 AND no back problems. 
        // Ask the user for all three and tell them if they can ride.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        int height = sc.nextInt();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Do you have back problems?(yes/no)");
        String backProblem = sc.next();
        
        if(height >= 120 && age >= 10 && backProblem == "no"){
            System.out.println("You can ride!");
        }else{
            System.out.println("Sorry, you are not eligible!");
        }
    }
}
