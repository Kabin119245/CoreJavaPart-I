class Calculator {
    //variables
    int a;
    //methods

    public int adder(int n1, int n2) {
        System.out.println("I am called");
        return (n1 + n2);
    }
}


public class oop {
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 10;

        Calculator calc = new Calculator();
        int result = calc.adder(num1, num2);
        System.out.println(result);
    }
}


//oop concept
// classes and objects
//objects -- properties and behaviours
// classes 

