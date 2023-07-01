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
        int k=sc.nextInt();
        int d=0;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]==k)
            {
                d=1;
            }
        }
        if(d==1)
        System.out.println("True");
        else
        System.out.println("False");
        
        
        
    }
}