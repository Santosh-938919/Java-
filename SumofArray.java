import java.util.*;

public class SumofArray
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of array = ");
    int size = s.nextInt();
    int arr[] = new int[size];
    int i,sum=0;
    
    System.out.println("Enter the elements of array = ");
    for(i=0;i<size;i++)
    {
        arr[i]=s.nextInt();
        sum += arr[i];
    }

/*    for(int e:arr)
    System.out.println(e); */

    System.out.println("Sum of array elements = "+sum);
}
}
