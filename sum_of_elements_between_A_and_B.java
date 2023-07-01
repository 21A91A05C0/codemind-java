import java.util.*;
public class l
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int z=sc.nextInt();
        int b=sc.nextInt();
        int d=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=z && a[i]<=b)
            {
                
                d=d+a[i];
            }
        }
        
            System.out.println(d);
        
        
        
    }
}