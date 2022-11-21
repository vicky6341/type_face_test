import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=find(n);
        System.out.println(res);
    }
    public static int find(int n)
    {
        String s="";
        boolean flag=false;
        if(n<0)
        {
            flag=true;
            n=(-1)*n;
        }
        while(n>0)
        {
            s=s+(n%3);
            n=n/3;
        }
        if(flag)
         return (-1)*Integer.parseInt(s);
        else
         return Integer.parseInt(s);
    }
}