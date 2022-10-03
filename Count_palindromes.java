import java.util.*;
class sowji
{
    public static int palin(int n)
    {
        int s=n;
        int d=0;
        int r=0;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
            
        }
        if(r==s)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
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
        for(int i=0;i<n;i++)
        {
            if(palin(arr[i])==1)
            {
                c=c+1;
            }
        }
        System.out.println(c);
    }
}