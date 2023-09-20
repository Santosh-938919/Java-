/*
Name = Arpan Kumar
Roll no. = 21
Section = E

7.  WAP Average of all the elements in the array input will be taken from 
user.
*/

import java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the size of array = ");
        int n = s.nextInt(), sum = 0, i;
        int arr[] = new int[n];
        System.out.println("\nEnter the elements of array = ");
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }

        System.out.println("\nSum of all elements = " + sum);
        System.out.println("\nAverage of all elements = " + sum / n);

    }
}
