// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A3
{
    //	public abstract void show();
//	public abstract void config();
    int age=44;            // final and static
    String area="London";

    void show();
    void config();
}

interface X
{
    void run();
}
interface Y extends X
{

}

class B3 implements A3,Y
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in cofing");
    }
    public void run()
    {
        System.out.println("running...");
    }
}
public class MoreOnInterfaces {
    public static void main(String[] args) {

        A3 obj;
        obj=new B3();

        obj.show();
        obj.config();

        X obj1=new B3();
        obj1.run();

        //   	A.area="Hyderabad";

        System.out.println(A3.area);

    }
}
