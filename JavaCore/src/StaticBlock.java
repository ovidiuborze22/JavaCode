class Mobile3{
    String brand;
    int price;
    String network;
    static String name;

    static {
        name="Phone";
        System.out.println("in static block");
    }

    public Mobile3() {
        brand="";
        price=200;
//		name="Phone";
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand+" : "+price+" : "+name);
    }


}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException
    {

        Class.forName("Mobile3");

		Mobile3 obj1=new Mobile3();
		obj1.brand="Apple";
		obj1.price=1500;
		Mobile3.name="SmartPhone";

		Mobile3 obj2=new Mobile3();


    }
}