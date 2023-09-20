/*
Name = Arpan Kumar
Roll no. = 21
Section = E

1. WAP to differentiate instance variables, local variables, and static 
variables.
*/



import java.util.*;
class data
{
    private 
    String name;
    int roll;    //These are the instance variables 
    static String course = "BCA";    //This is a static variable
    
    public void setdata(String n,int r)
    {
        name = n;
        roll = r;
    }

     void getdata()
    {
        System.out.println("\nName of student is "+name);
        System.out.println("\nRoll number = "+roll);
        System.out.println("\nCourse = "+course);
    }
};

public class diff
{
    public static void main(String[]args)
{
    int r;
    String n;   //These are local variable 
    Scanner s = new Scanner(System.in);

    System.out.println("\nEnter your name = ");
        n = s.nextLine();
    System.out.println("\nEnter your roll no. = ");
        r = s.nextInt();
    
    data d1 = new data();
    d1.setdata(n, r);
    d1.getdata();

}
}
