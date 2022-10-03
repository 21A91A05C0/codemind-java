import java.util.*;
class smily
{
    public static int palin(int n)
    {
        int re=n;
        int d=0;
        int r=0;
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(palin(a)==1)
        {
            System.out.println(2);
        }
        else
        {
            System.out.println(1);
        }
    }
}