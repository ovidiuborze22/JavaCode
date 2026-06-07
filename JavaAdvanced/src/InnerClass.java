class A11
{
    int age;

    public void show()
    {
        System.out.println("in show");
    }

//	class B
//	{
//		public void config()
//		{
//			System.out.println("in config");
//		}
//	}

    static class B11
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        A11 obj = new A11();
        obj.show();

        //    	A.B obj1=obj.new B();
        //    	obj1.config();

        A11.B11 obj1 = new A11.B11();
        obj1.config();

    }
}
