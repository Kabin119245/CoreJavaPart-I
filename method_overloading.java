class Calculator1 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, int b) {
        return a + b;
    }

    public int add(int a,int b, int c){
        return a + b + c;
    }
    
}


public class method_overloading {
    public static void main(String[] args) {

        Calculator1 calc = new Calculator1(); //obj is reference variable
        double r1 = calc.add(5.3, 2);
        System.out.println(r1);
        int r2 = calc.add(5,2);
        System.out.println(r2);
        int r3 = calc.add(5, 2, 3);
        System.out.println(r3);
        
    }
}