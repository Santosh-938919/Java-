import java.util.*;

public class CountDigit_string
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.print("\nEnter the string value = ");
    String str = s.nextLine();
    // char c[] = new char[str.length()];
    int count = 0;
    for(int i=0;i<str.length();i++)
    {
        char ch = str.charAt(i);
        // c[i] = ch;
        // System.out.print(" "+ch);
        if(Character.isDigit(ch))
            count++;
    }
    System.out.print("Digit = "+count);
}
}
