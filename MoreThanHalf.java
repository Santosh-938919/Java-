import java.util.*;

public class MoreThanHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the size of array = ");
        int n = sc.nextInt();
        int i, j, x = 0, flg = 0;
        int arr[] = new int[n];
        int tp[] = new int[1];
        System.out.println("\nEnter the elements of array = ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (i = 0; i < n; i++) {
            int count = 0;
            for (j = i; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > (n / 2)) {
                flg++;
                tp[x++] = arr[i];
            }
        }

        System.out.println("\nTotal no. of >(n/2) is " + flg);
        System.out.println("\nThese are the numbers : ");
        for (int e : tp)
            System.out.println(e);

    }
}
