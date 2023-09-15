/*
Name = Arpan Kumar
Roll no. = 21
Section = E

8.  WAP to Find Second Smallest and Second Largest Element in an array 
input will be taken from user without using predefined function. 
*/

import java.util.*;

public class SecondElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the size of array = ");
        int n = s.nextInt(), i, tp;
        int arr[] = new int[n];
        System.out.println("\nEnter the elements of array = ");
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    tp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tp;
                }
            }
        }

        System.out.println("Second smallest element in the array = " + arr[1]);
        System.out.println("Second largest element in the array = " + arr[n - 2]);

    }
}
