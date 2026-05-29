import java.util.Scanner;

public class AreaOfCircle {
    //area = π × r²
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * Math.pow(r,2);
        System.out.println("Area of circle: " + area);
    }
}
