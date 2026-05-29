

class Testing{ //class
    
    public int add(int n1, int n2){//method: behaviour
        return n1+n2;
    }
    public int add(int n1, int n2 , int n3){//method: behaviour
        return n1+n2+n3;
    }
}

class MethodOverloading{
    public static void main(String args[]){
        int a = 10, b = 20 , c = 30;

        Testing test = new Testing(); // creating the object
        int result = test.add(a,b);
        System.out.println(result);
        result = test.add(a,b,c);
        System.out.println(result);

    }
}