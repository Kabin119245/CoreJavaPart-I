class Television {
    String brand;
    String type;
    int price;
    static String name; // class member

    static {
        name = "TV";
        System.out.println("In static block");
    }

    public Television() {
        brand = "LG";
        type = "LCD";
        price = 1000;
        //name = "TV"; it should not be placed in Constructor beacuse it is called every time when new object is created and its value is same for every object, so we use static block which is called only once
        System.out.println("In constructor");

    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + type + " : " + name);
    }
}



public class static_block {
    public static void main(String[] args)    {

        Television obj1 = new Television();
        obj1.brand = "SONY";
        obj1.price = 10000;
        //obj1.name = "TV"; static variable should not be called like this, we use class name
        Television.name = "TV"; //Static variable 
        obj1.show();


        Television obj2 = new Television();
        obj2.show();
        
    }
    
}
