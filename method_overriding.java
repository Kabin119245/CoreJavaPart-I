class I {
    public int add (int n1, int n2) {
        return n1 + n2;
    }
}

class II extends I {

    public int add(int n1, int n2) {
        return n1 + n2 +1 ;
    }

}

//here both classses have same function, but when we call add function through object of II, method of class II is executed, it is known as function/ method overriding where method of parent class is overridden by base class;


public class method_overriding {
    public static void main(String[] args) {
        II i = new II();
        System.out.println(i.add(1, 2));
    }
    
}
