@FunctionalInterface
interface A5
{
    void show();
//	void run();
}
//class B implements A
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}

public class FunctionalInterfaceNew {
    public static void main(String[] args) {

        A5 obj=new A5()
        {
            public void show()
            {
                System.out.println("in Show");
            }
        };
        //   	A5 obj=new A5();
        //   	A5 obj=new B5();
        obj.show();
    }
}
