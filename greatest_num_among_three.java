public class greatest_num_among_three {
    public static void main(String[] args) {
        int a = 50, b = 20, c = 15;
        // int max = Math.max(a, Math.max(b, c));
        // System.out.println(max);
        if (a>b) {
            if (a>c) {
                System.out.println("a is greatest " + a);
            }
            else {
                System.out.println("c is greatest " + c);
            }
        }
        else {
                System.out.println("b is greatest " + b);
        }
    }
}
