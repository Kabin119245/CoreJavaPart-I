public class typeconversion {
    public static void main(String[] args) {
        byte b = 12;
        System.out.println(b);
        int a = 56;
        b = (byte)a; //explicit conversion
        System.out.println(b);
        func();

    }

    static void func() {
        float x = 2.5f;
        int y = (int)x; //loss of data
        System.out.println(y);

    }
}
