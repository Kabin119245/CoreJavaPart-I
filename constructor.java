class Human {
    private int age;    
    private String name;
    //everytime we create a object, constructor will be called
    public Human() {
        System.out.println("In constructor");
        age = 20;
        name = "Kabina";

    }
    //when we want to connect our java code to data base, we write that connection in constructor

    public Human(int age, String name) {
        System.out.println("In parametrized constructor");
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class constructor {
    public static void main(String[] args) {
       Human obj = new Human();
       Human obj1 = new Human(21, "Kanchan");

       System.out.println(obj.getName() + " " + obj.getAge());
       System.out.println(obj1.getName() + " " + obj1.getAge());
    }
}
