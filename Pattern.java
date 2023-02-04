import java.util.*;
class print{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}