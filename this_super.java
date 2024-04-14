//every constructor in java has a method which is there even if you dont mention it and that method is called Super


class A { // A is super class 
    public A() {
        super();
        System.out.println("In A");
    }

    public A(int n) {

        super();
        System.out.println("In A int");
    }

}

class B extends A { // B is subclass
    public B() {
        super(); //John Cena method, because you can't see it, super means call the constructor of super class
        System.out.println("In B");

    }

    public B(int n) {
        super(n); //now passing the parameter it will call  the parametrized constructor of super class
        System.out.println("In B int");
    }

}



public class this_super {
    public static void main(String[] args) {

        B obj = new B();
        B obj1 = new B(10); 

    }
    
}
