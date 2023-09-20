//Insertion sort


import java.util.*;

public class insertion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the size of array = ");
        int n = s.nextInt(), i;
        int arr[] = new int[n];
        System.out.println("\nEnter the elements of array = ");
        for (i = 0; i < n; i++)
            arr[i] = s.nextInt();

        for (i = 1; i < n; i++) {
            int j = i - 1;
            int tp = arr[i];
            while (j >= 0 && arr[j] > tp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = tp;
        }

        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
