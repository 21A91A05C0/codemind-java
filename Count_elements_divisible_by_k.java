import java.util.*;
class sowji
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         int c=0;
         int[] arr=new int[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
             if(arr[i]%m==0)
             {
                 c++;
             }
         }
         
         System.out.println(c);
     }
 }