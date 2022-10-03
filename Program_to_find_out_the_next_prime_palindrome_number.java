import java.util.*;
class p
{ 
    public static int rev(int n)
    {
        int re=n;
        int r=0;
        int d=0;
        while(n!=0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(re==r)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
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
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=a+1;i<=100000;i++)
        {
            if(prime(i)==1 && rev(i)==1)
            {
                System.out.println(i);
                break;
            }
        }
    }
}