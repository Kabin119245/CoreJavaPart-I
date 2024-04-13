public class pallindrome {
    public static void main(String[] args) {
        int n = 121;
        int m = n;

        int reverse = 0;
        while (n != 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n/10;
        }

        if (reverse == m  ) {
            System.out.println("pallindrome");
        }
        else {
            System.out.println("not a pallindrome");
        }
    }
}
