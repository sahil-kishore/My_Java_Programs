class MathMethod{
    public static void main(String[] args) {
        double n1 = 3.14;
        double n2 = -10;

        //min and max
        System.out.println("Min: " + Math.min(n1,n2)); // -10.0
        System.out.println("Max: "+Math.max(n1,n2)); // 3.14

        //absolute value
        System.out.println(Math.abs(n2)); //10.0

        //square root
        System.out.println("√100: " + Math.sqrt(100)); //10.0

        //power : 2^10
        System.out.println("2^10: " + Math.pow(2,10)); //1024.0

        //Rounding
        System.out.println("Round 3.5: " + Math.round(3.5)); //4
        System.out.println("Ceil 3.1: " + Math.ceil(3.3)); //4.0
        System.out.println("Floor 3.9: " + Math.floor(3.9)); //3.0

        //constants
        System.out.println("PI: " + Math.PI); //3.141592653589793
        System.out.println("Euler's number: " + Math.E); // 2.718281828459045

    }
}