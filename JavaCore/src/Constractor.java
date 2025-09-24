class Human3
{
    private int age;
    private String name;

    public Human3()
    {
        age=12;
        name="John";
        //System.out.println("in constructor");
    }
    public int getAge(){
        return age;
    }
    public void SetAge(int age)
    {
        this.age=age;
    }


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}

public class Constractor {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Human3 obj=new Human3();
        Human3 obj1=new Human3();
        System.out.println(obj.getName()+" : "+obj.getAge());

        obj.SetAge(30);
        obj.setName("Reddy");


        //System.out.println(obj.getName()+" : "+obj.getAge());
    }
}