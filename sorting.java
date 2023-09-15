import java.util.*;

public class sorting
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("\nEnter the size of array = ");
    int size = s.nextInt();
    int a[] = new int[size];
    System.out.println("Enter the elements of array = ");
    int i,j,tp;
    for(i=0;i<size;i++)
    a[i]=s.nextInt();

    for(i=0;i<size;i++)
    {
        for(j=i+1;j<size;j++)
        {
            if(a[i]>a[j])
            {
                tp = a[i];
                a[i] = a[j];
                a[j] = tp;
            }
        }
    }

    System.out.println("Array = ");
    for(int e:a)
    {
        System.out.println(e);
    }

}
}
