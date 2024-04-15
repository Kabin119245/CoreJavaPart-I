public class Calc3 extends Calc2{
    public double power(int x, int n){
        return Math.pow(x, n);
    }


    public int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }

        return fact;

    }
}
