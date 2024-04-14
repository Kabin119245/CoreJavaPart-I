//every constructor in java has a method which is there even if you dont mention it and that method is called Super


class A  extends Object{ // A is super class , even if you dont mention extends Object it is there
    public A() {
        super();
        System.out.println("In A");
    }

    public A(int n) {

        super();
        System.out.println("In A int");
    }

}

//here we can see that suoer method of class B is trivial as it has super class A but what about class A, as it doesnt have a super class 
//so the answer to that question is every class in java extends Object class

class B extends A { // B is subclass
    //Class B extends A and A extends Object class--> multilevel inheritance

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
