class Computer {
    public void playMusic() {
        System.out.println("Music is playing");
    }


    public String getMoney(int cost) {
        System.out.println("I got money: " + cost);
        if (cost >=10)
            return "Pen";
         
        return "Insufficient money";
    }
}


public class oop_methods {

    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str =obj.getMoney(5);
        System.out.println(str);
    }
}
