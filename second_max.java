public class second_max
{
    public static void main(String[]args)
    {
        int arr[]={5,8,2,4,6,9},n=6,i,tp=0;

        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    tp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tp;
                }
            }
        }

        System.out.println("Second largest no. in the array = "+arr[n-2]);
    
    }
}