import java.util.*;

public class zeros_at_end
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("\nEnter the size of array = ");
    int size = s.nextInt();
    int a[] = new int[size];
    int i,j;
    System.out.println("\nEnter the elements of array = ");
    for(i=0;i<size;i++)
        a[i] = s.nextInt();

    for(i=0;i<size;i++)
    {
        if(a[i]==0)
        {
            for(j=i+1;j<size;j++)
            a[j-1] = a[j];

            a[size-1] = 0;
            size--;
        }
    }

    System.out.println("Array = ");
    for(int e:a)
    {
        System.out.println(e);
    }
}
}
