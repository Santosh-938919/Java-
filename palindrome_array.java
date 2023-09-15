import java.util.*;

public class palindrome_array
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("\n\t<Palindrome Array>");
    System.out.println("\nEnter the size of array = ");
    int size = s.nextInt();
    int []arr = new int[size];
    int lb=0,ub=size-1,mid=(ub+lb)/2,i;

    System.out.println("\nEnter the elements of array = ");
    for(i=0; i<size; i++)
        arr[i]=s.nextInt();

    for(i=0;i<mid;i++)
    {
        if(arr[i]!=arr[size-1-i])
        {
            System.out.println("It  is not a palindrome array.");
            break;
        }
    }

    if(i==mid)
    System.out.println("\nIt is a palindrome array.");
}
}
