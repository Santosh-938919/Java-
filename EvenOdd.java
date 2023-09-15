import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[]args)
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the value = ");
        int a = n.nextInt();
        
        if(a%2==0)
        System.out.println("It is Even no. "+a);
        else
        System.out.println("It is Odd no. "+a);

    }
}