//dynamic method dispatch
class M {
    void show() {
        System.out.println("In M show");
    }
}


class N  extends M {
    void show() {
        System.out.println("In N show");
    }
}


class O extends M {
    void show() {
        System.out.println("In O show");
    }
}

public class ddm {

    public static void main(String[] args) {
        
        M obj = new M();
        obj.show();

//irrespective of what type of object you have or type  variable you have , but it all depends on what object you have
//and only possible in inheritance

//we can have child objects for parent variable


        obj = new N(); 
        obj.show();

        obj = new O();
        obj.show();

    }
    
}
