class Human {
    private int age;
    private String name;
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





public class getter_setters {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(23);

        obj.setName("Kabin Giri");

        obj.setName("Kabin");

        System.out.println(obj.getName() + " " + obj.getAge());

    }
    
    
}
