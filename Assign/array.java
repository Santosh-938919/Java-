import java.util.*;

public class array
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("\nEnter the size of array = ");
        int n = s.nextInt(),i;
        int arr[] = new int[n],ta[] = new int[n];
        System.out.println("\nEnter the elements of array = ");
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            ta[n-1-i] = arr[i];
        }

        System.out.println("\nReversed Array : ");
        for(int e:ta)
            System.out.println(e); 
}
}
