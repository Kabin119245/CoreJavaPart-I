// final keyword can be used for variable, method and class


//if class is made final, then it cannot inheritated
class Circle {
    final double PI = 3.14;  

//final keeyword is used in method to stop it from overriding
    public final void  show() {
        System.out.println("By  Kabin Giri");
    }
    public double area(int r){
        return (PI * r * r);
    }

}

class Circ extends Circle {

    // public void show() {
    //     System.out.println("By  Kanchan Dhamala");
    // }

}


public class FinalKeyword {


    public static void main (String[] args) {

        //final keyword in varible is used to make in constant, eg PI

        final double PI = 3.14;
        System.out.println(PI);

        Circ obj = new Circ();
        obj.show();

        double a = obj.area(5);

        System.out.println(a);
        

    }
    
}
