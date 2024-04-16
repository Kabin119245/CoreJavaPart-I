class A {
    public void show1() {
        System.out.println("In Show A");
    }
}

class B extends A {

    public void show2() {
        System.out.println("In Show B");
    }
}


public class UpCasting {

    public static void main(String[] args) {
        // A obj = new A();
        // obj.show1();


        //this is upcasting
        //lets create object of B but type of A
        A obj = (A) new B();
        //parent reference = child object
        obj.show1();

        //suppose we dont want to create new object, we can do down casting 

        B obj1 = (B) obj;
        obj1.show2();

    }
    
}
