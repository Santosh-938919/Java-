import java.util.*;


public class anagram
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.print("\nEnter the string values = ");
    String str = s.nextLine(), str2 = s.nextLine();

    char ch[] = str.toCharArray(), ch2[] = str2.toCharArray();
    Arrays.sort(ch);
    Arrays.sort(ch2);
    int i;
    for( i=0;i<ch.length;i++)
    {
        if(ch[i]!=ch2[i])
        {
            System.out.println("These are not anagram strings.");
            break;
        }
    }
    if(i==ch.length)
        System.out.println("These are anagram strings.");
}
}
