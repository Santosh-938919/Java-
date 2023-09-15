//WAP to convert 2 digits into binary and add them into binary.

import java.util.*;


public class add_in_binary
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the 1st values = ");
    int a = s.nextInt(),arr[] = new int[50],rem = 0,as = 0;
    int i,sum,carry = 0;
    while(a>1)
    {
        rem = a%2;
        arr[as++] = rem;
        a /= 2;
        if(a==1)
        arr[as] = a;
    }

    for(i=as;i>=0;i--)
    System.out.print(" "+arr[i]);

    System.out.print("\nEnter the 2nd value = ");
    int b = s.nextInt(),arr1[] = new int[50],bs = 0,size;
    
    while(b>1)
    {
        rem = b%2;
        arr1[bs++] = rem;
        b /= 2;
        if(b==1)
        arr1[bs] = b;
    }
    for(i=bs;i>=0;i--)
    System.out.print(" "+arr1[i]);

    if(as>bs)
    size = as+1;
    else
    size = bs+1;

    int ads = size+1,add[] = new int[ads];
    for(i=0;i<=size;i++)
    {
        sum = arr[i] + arr1[i] + carry;
        if(sum==2)
        {
            // System.out.print("\nSum in if = "+sum);
            add[--ads] = 0;
            carry = 1;
        }
        else if(sum==3)
        {
            add[--ads] = 1;
            carry = 1;
        }
        else
        {
            // System.out.print("\nSum in else = "+sum);
            add[--ads] = sum;
            carry = 0;            
        }
    }
    System.out.println("\nResult =");
    for(int el:add)
    System.out.print(" "+el);
}
}
