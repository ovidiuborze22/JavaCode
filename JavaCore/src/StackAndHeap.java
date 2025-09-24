class Calculator2
{
    int num=5;
    public int add(int n1, int n2)
    {
        System.out.println(num);
        return n1+n2;
    }
}


public class StackAndHeap {
    public static void main(String[] args) {
        int data=10;
        Calculator2 obj=new Calculator2();
        Calculator2 obj1=new Calculator2();
        int r1=obj.add(3,4);
        //System.out.println(r1);
        obj.num=8;

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}