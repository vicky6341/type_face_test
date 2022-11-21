import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int res=find(str1,str2);
        System.out.println(res);
    }
    public static int find(String s1,String s2)
    {
        char ch=s2.charAt(s2.length()-1);
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==ch)
              sum+=1;
        }
        return sum;
    }
}