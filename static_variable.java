class Mobile {
    String brand;
    int price;
    static String name; // class member
    //static variable will have same value for all objects
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class static_variable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1000;
        //obj1.name = "Smartphone"; static variable should not be called like this, we use class name
        Mobile.name = "Phone"; //Static variable 
        obj1.show();

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 2000;
        obj2.show();

    }
}
