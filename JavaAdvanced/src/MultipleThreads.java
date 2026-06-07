class A9 extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hi");
        }
    }
}

class B9 extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hello");
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args) throws NumberFormatException {

        A9 obj1=new A9();
        B9 obj2=new B9();

//    	obj1.show();
//    	obj2.show();

        obj1.start();
        obj2.start();
    }
}
