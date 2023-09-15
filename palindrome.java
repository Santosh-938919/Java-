/*
Name = Arpan Kumar
Roll no. = 21
Section = E

4.  WAP to Check whether a number is Palindrome or Not, input will be 
taken from user.
*/


import java.util.*;

public class palindrome
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the value = ");
    int v = s.nextInt();
    int rem,sum=0,tp=v;

    while(v>0)
    {
        rem = v%10;
        sum = (sum*10)+rem;
        v /= 10;
    }

    if(tp==sum)
    System.out.println("It is palindrome no.");
    else
    System.out.println("It is not palindrome no.");
}
}

