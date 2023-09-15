/*
Name = Arpan Kumar
Roll no. = 21
Section = E

3.  WAP to get name, age, roll of student by using Scanner class object and 
print also. 
*/

import java.util.*;

class data {
    private String name;
    int age, roll;

    public void setdata() {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter your name = ");
        name = s.nextLine();
        System.out.println("\nEnter the age = ");
        age = s.nextInt();
        System.out.println("\nEnter the roll no. = ");
        roll = s.nextInt();
    }

    void getdata() {
        System.out.println("\nDetails of Student : ");
        System.out.println("\nName of student is " + name);
        System.out.println("\nAge = " + age);
        System.out.println("\nRoll no. = " + roll);
    }

};

public class scanner {
    public static void main(String[] args) {
        data obj = new data();
        obj.setdata();
        obj.getdata();
    }
}
