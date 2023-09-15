import java.util.*;

public class binary_search
{
    public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of array = ");
    int size = s.nextInt();
    int i,lb=0,ub=size-1,mid;
    int a[] = new int[size];

    for(i=0;i<size;i++)
        a[i]=s.nextInt();

    System.out.println("Enter the value = ");
    int k = s.nextInt();
    
    while(lb<ub)
    {
        mid = (ub+lb)/2;

        if(mid==k)
        {
            System.out.println("Key is found at "+mid);
            break;
        }
        else if(a[mid]<k)
            lb = mid+1;
        else if(a[mid]>k)
            ub = mid - 1;
        else
            System.out.println("Key is not found .");
    }

}
}
