//Selection sort



import java.util.*;

public class Selection
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("\nEnter the size of array = ");
    int n = s.nextInt(), i;
    int arr[] = new int[n];
    System.out.println("\nEnter the elements of array = ");
    for (i = 0; i < n; i++)
        arr[i] = s.nextInt();

    for(i=0;i<n-1;i++)
    {
        int smallest = i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[smallest] > arr[j])
                smallest = j;
        }
        int tp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = tp;
        
    }

    for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
}
}
