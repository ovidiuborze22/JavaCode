abstract class A2
{
    public abstract void show();
//    public abstract void config();

}

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}

public class AbstractaAndAnonymousInnerClass {
    public static void main(String[] args) {

//    	A obj=new B();

        A2 obj=new A2()
            
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();

    }
}

