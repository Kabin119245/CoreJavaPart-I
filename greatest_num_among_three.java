public class greatest_num_among_three {
    public static void main(String[] args) {
        int a = 50, b = 60, c = 75;
        // int max = Math.max(a, Math.max(b, c));
        // System.out.println(max);
        if (a>b && a>c){
            System.out.println("a is greatest " + a);
            }
        else if (b>c){
                System.out.println("b is greatest " + b);
            }
        
        else {
                System.out.println("c is greatest " + c);
        }
    }
}
