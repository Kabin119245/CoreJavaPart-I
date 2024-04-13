public class whileloop {
    public static void main(String[] args) {
        int x = 5, n = 3;
        int result = 1;
        while(n > 0) {
            result = result * x;
            n = n - 1;
        }
        System.out.println(result);
    }
}
