/*
Name = Arpan Kumar
Roll no. = 21
Section = E

6.  WAP Sum Of Digits of a Number input will be taken from user.
*/

import java.util.*;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the value = ");
        int n = s.nextInt(), sum = 0, rem;

        while (n > 0) {
            rem = n % 10;
            sum += rem;
            n /= 10;
        }

        System.out.println("\nSum = " + sum);
    }
}
