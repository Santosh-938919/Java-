/*
Name = Arpan Kumar
Roll no. = 21
Section = E

10.WAP to sort an array, input taken from user. -
*/



//Bubble sort
import java.util.*;

public class bubble {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the size of array = ");
        int n = s.nextInt(), i;
        int arr[] = new int[n];
        System.out.println("\nEnter the elements of array = ");
        for (i = 0; i < n; i++)
            arr[i] = s.nextInt();

        for(i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int tp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tp;
                }
            }
        }

        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
