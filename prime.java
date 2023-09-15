/*
Name = Arpan Kumar
Roll no. = 21
Section = E

5.  WAP to Check if a number is prime or not input will be taken from user.
*/


import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the value = ");
        int n = s.nextInt(), i;

        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("\nIt is not a prime number.");
                break;
            }
        }
        if (i == n)
            System.out.println("\nIt is a prime number.");

    }
}
