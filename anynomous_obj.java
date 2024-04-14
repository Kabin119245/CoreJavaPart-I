class A {

    public A() {
        System.out.println("Object created");
    }


    void show() {
        System.out.println("In A show");
    }


}


public class anynomous_obj {
    public static void main(String[] args) {

         //we can create a new object as
         new A(); //these types of object are known as anynomos object as they donot have the name
         //and object having name is known as referenced object
         //we cannout reuse anynomous object
         
        
    }

   
    
}
