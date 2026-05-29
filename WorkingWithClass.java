

class Calculator{ //class
    
    public int add(int n1, int n2){//method: behaviour
        return n1+n2;
    }
}

class WorkingWithClass{
    public static void main(String args[]){
        int a = 10, b = 20;

        Calculator calc = new Calculator(); // creating the object
        System.out.println(calc.add(a,b));

    }
}