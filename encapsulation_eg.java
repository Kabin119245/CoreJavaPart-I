//encapsulation means binding data and methods together
//here, age and Name are private which cannot be accessed directly, can be accessed through methods
class Human {
    private int age;
    private String name;

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}


public class encapsulation_eg {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(23);
        obj.setName("Kabin");
        System.out.println(obj.getName() + " " + obj.getAge());

    }
    
}
