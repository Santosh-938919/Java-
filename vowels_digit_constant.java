import java.util.*;

public class vowels_digit_constant
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.print("\nEnter the string value = ");
    String str = s.nextLine();
    int vowels = 0,constant = 0, digit = 0;

    for(int i=0;i<str.length();i++)
    {
        char ch = str.charAt(i);
        if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
            vowels++;
        else if(Character.isDigit(ch))
            digit++;
        else
            constant++;
    }

    System.out.println("\nVowels = "+vowels);
    System.out.println("Constant = "+constant);
    System.out.println("Digit = "+digit);

    
}
}