import java.util.*;
// import java.lang.*;

public class CountWords_string {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the string value = ");
        String str = s.nextLine();
        int count = 0,i=0;
        char ch[] = str.toCharArray();
        if(ch[i]!=0x00)
            count = 1;
        for(i=0;i<ch.length;i++)
        {
           
            if(ch[i]==32)
                count++;
        }
        System.out.print("\nWords = "+count);
    }
}
