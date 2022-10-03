import java.util.*;
class n
{
    public static int prime(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else
        {
            int c=0;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    c=c+1;
                }
            }
            if(c==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        
        for(int i=a;i<=b;i++)
        {
            if(prime(i)==1)
            {
                c=c+1;
            }
        }
       
        System.out.format("%d",c);
    }
}