import java.util.*;
class sowji
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]>arr[i])
            {
                c=c+1;
            }
        }
        if(c==n-1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}