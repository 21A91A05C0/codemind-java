import java.util.*;
class n
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a=='e'||a=='a'|| a=='i'||a=='o' || a=='u'|| a=='A'||
        a=='E'|| a=='I' || a=='o'||a=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}