class A
{
    public A()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("in A show");
    }
}


public class AnonymousObject
{
    public static void main(String a[])
    {
        int marks;
        marks=99;

        new A();   //anonymous object
        new A().show();

//		A obj=new A();
        A obj;
        obj=new A();

        obj.show();
    }
}
