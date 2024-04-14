
//previously super method calls the constructor of super class,
//what if we want to execute  the constructor of same class then we use this() method
class A {
    public A() {
        super();
        System.out.println("In A");
    }

    public A(int n) {
        super();
        System.out.println("In A int");
    }
}


class B extends A {

        public B() {
            super(); //class constructor of super class i.e A
            System.out.println("In B");
        }


        public B(int n) {
            this(); //calls its own constructor
            System.out.println("In B int");
        }


}


public class this_two {
    public static void main(String[] args) {
        B obj = new B(5); //calls parametrized constructor of B

    }


    
}
