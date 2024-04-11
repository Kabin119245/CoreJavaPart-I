public class stringbuffer {
    public static void main(String[] args) {
        //to make String mutable we use Stringbuffer
        StringBuffer sb = new StringBuffer("KABIN");
        System.out.println(sb.capacity());
        //before it was 16 after i input kabin it becomes 21
        //it stores my name and again gives 16 spaces extra
        sb.append(" KANCHAN");//changing data
        System.out.println(sb);

    }
}
