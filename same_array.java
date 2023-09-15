public class same_array
{
    public static void main(String[]args)
    {
        int arr1[]={1,2,3,4,5,6}, arr2[]={1,2,3,4,5,6},flg=0;

        for(int i=0;i<6;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                flg++;
                break;
            }
        }

        if(flg!=0)
        System.out.println("\n Both arrays are different.");
        else
        System.out.println("\n Both arrays are same.");
    }
}