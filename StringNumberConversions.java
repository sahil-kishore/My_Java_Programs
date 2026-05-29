public class StringNumberConversions {
    public static void main(String[] args) {
        //String to integer 
        String str = "45";
        int num = Integer.parseInt(str); //45
        System.out.println(num);

        //String to double
        String s = "3.14";
        double val = Double.parseDouble(s); //3.14
        System.out.println(val);

        //Number to string 
        int age = 26;
        String ageStr1 = String.valueOf(age); //method 1 : String.valueOf()
        System.out.println(ageStr1);
        String ageStr2 = Integer.toString(age); // method 2 : Integer.toString()
        System.out.println(ageStr2);
        String ageStr3 = age + ""; //method 3 : Concatenation trick
        System.out.println(ageStr3);
    }
}
