class A1
{
    public void show()
    {
        System.out.println("in A show");
    }
}
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B Show");
//	}
//}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        //A obj=new B();

        A1 obj=new A1()
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
