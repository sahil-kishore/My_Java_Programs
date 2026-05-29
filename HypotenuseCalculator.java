import java.util.Scanner;

class HypotenuseCalculator{
    public static void main(String[] args) {
        //The Pythagorean theorem states: c² = a² + b², therefore: c = √(a² + b²)
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side A: ");
        double a = sc.nextDouble();
        System.out.println("Enter side B: ");
        double b = sc.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Hypotenuse = " + c);

        sc.close();
    }
}