/*
Name = Arpan Kumar
Roll no. = 21
Section = E

2.  WAP to use this keyword to differentiate between local variable and 
instance variable as well as by using object.
*/

import java.util.*;

class data {
    private int x;

    public void setdata(int x) {
        this.x = x;
    }

    void getdata() {
        System.out.println("Value = " + x);
    }
};

public class this_keyword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        data obj = new data();
        System.out.println("\nEnter the value = ");
        int n = s.nextInt();
        obj.setdata(n);
        obj.getdata();
    }
}
