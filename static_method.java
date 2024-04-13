class Car {
    String brand;
    int price;
    String type;
    static String name;// class member

    //if we want to use non static method,we need to create object
    public void show() {
        System.out.println(brand + " : " + price + " : " + type + " : " + name);
    }

    //we can only use static variable in static method 
    public static void show1() {
        System.out.println("In static method" + name);
    }


    //we can use non static variable in static method indirectly using object reference

    public static void show2(Car obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.type + " : " + name);
    }


        //clas memeber in static block
    static {
        name = "CAR";
    }

}



public class static_method {
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.brand = "Honda";
        obj1.price = 10000;
        obj1.type = "Sedan";
        


        Car obj2 = new Car();
        obj2.brand = "Toyota";
        obj2.price = 50000;
        obj2.type = "SUV";

        //we call non static method using object
        obj1.show();
        obj2.show();

        //we call static method using Classname
        Car.show1();

        //passing obj in static method

        Car.show2(obj1);


    }
}
