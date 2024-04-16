
class Cycle {
    int price;
    String brand;

    public void show() {
        System.out.println(brand + " : " + price);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cycle other = (Cycle) obj;
        if (price != other.price)
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cycle [price=" + price + ", brand=" + brand + "]";
    }

}

public class ObjClass {

    public static void main(String[] args) {
        Cycle obj = new Cycle();
        System.out.println(obj);

        Cycle obj1 = new Cycle();
        obj1.brand = "hero";
        obj1.price = 1000;
        obj1.show();

        Cycle obj2 = new Cycle();
        obj2.brand = "Smart";
        obj2.price = 2000;
        obj2.show();
    }

}
