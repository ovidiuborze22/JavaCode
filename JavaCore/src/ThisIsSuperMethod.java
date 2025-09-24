/**
 // super()
 class A
 {
 public A()
 {
 super();
 System.out.println("in A");
 }
 public A(int n)
 {
 super();
 System.out.println("in A int");
 }
 }
 class B extends A
 {
 public B()
 {
 //		super();
 super(5);
 System.out.println("in B");
 }
 public B(int n)
 {
 //		super();   //call default constructor of super class
 super(n);
 System.out.println("in B int");
 }
 }
 public class Demo {
 public static void main(String[] args)
 {

 B obj=new B();
 //		B obj=new B(5);
 }
 }
 **/


//this()
class A2
{
    public A2()
    {
        super();
        System.out.println("in A");
    }
    public A2(int n)
    {
        super();
        System.out.println("in A int");
    }
}

class B2 extends A2
{
    public B2()
    {
        super();
        System.out.println("in B");
    }
    public B2(int n)
    {
        this();  //call constructor of same class
        System.out.println("in B int");
    }
}
public class ThisIsSuperMethod {
    public static void main(String[] args)
    {

//		B2 obj=new B2();
        B2 obj=new B2(5);
    }
}