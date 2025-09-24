class Student1
{
    int rollno;
    String name;
    int marks;
}

public class EnhancedForLoop {
    public static void main(String[] args)
    {
        Student1 s1=new Student1();
        s1.rollno=1;
        s1.name="Navin";
        s1.marks=88;

        Student1 s2=new Student1();
        s2.rollno=2;
        s2.name="Harsh";
        s2.marks=67;

        Student1 s3=new Student1();
        s3.rollno=3;
        s3.name="Kiran";
        s3.marks=97;

        System.out.println(s1.name + ":"+ s1.marks);

        Student1 students1[]=new Student1[3];
        students1[0]=s1;
        students1[1]=s2;
        students1[2]=s3;

//		for(int i=0;i<students.length;i++)
//		{
//			System.out.println(students[i].name+":"+students[i].marks);
//		}

        for(Student1 stud: students1)
        {
            System.out.println(stud.name +":"+stud);
        }




        int nums[]=new int[4];
        nums[0]=4;
        nums[1]=8;
        nums[2]=3;
        nums[3]=9;

//		for (int i=0;i<nums/length;i++)
//		{
//			System.out.println(nums[i]);
//		}

        for(int n: nums)
        {
            System.out.println(n);
        }

    }
}