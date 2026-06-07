class NavinException1 extends Exception
{
    public NavinException1(String string)
    {
        super(string);
    }
}

class A8
{
    public void show() throws ClassNotFoundException
    {
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

        Class.forName("Calc");
    }
}

public class DuckingExceptionUsingThrows {

    static {
        System.out.println("Class Loader");
    }

    public static void main(String[] args) {

//    	try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

        A8 obj=new A8();
        try {
            obj.show();
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }


    }
}
