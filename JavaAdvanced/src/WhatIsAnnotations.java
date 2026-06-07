@Deprecated
class A4
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in show A");
    }
}

class B1 extends A4
{
    @Override
//	public void showTheDataWhichBelongToThisClass()
    public void showTheDataWhichBelongsToThisClass()

    {
        System.out.println("in show B");
    }
}

public class WhatIsAnnotations {
    public static void main(String[] args) {

        B1 obj=new B1();
        obj.showTheDataWhichBelongsToThisClass();

    }
}
