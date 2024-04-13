public class logicaloperator {
    public static void main(String[] args) {
        //and & , or | , not !
        // && , || short circuit
        int x = 7;
        int y = 6;
        int a = 5;
        int b = 3;
        boolean result1 = x > y;
        boolean result2 = x > y && a < b;
        boolean result3 = x > y || a < b;
        System.out.println(result1 + " " +  result2 + " " + result3);


    }
}
