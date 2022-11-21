import java.util.*;
public class Main
{
    public static int fun(ArrayList<Integer> arr,int n){
       String s="";
       for(int i=n;i>0;)
       {
           int rem=i%7;
           s=arr.get(rem)+s;
           i=i/7;
       }
       return Integer.parseInt(s);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    ArrayList<Integer> arr=new ArrayList<>();
	    arr.add(0);
	    arr.add(1);
	    arr.add(2);
	    arr.add(5);
	    arr.add(6);
	    arr.add(8);
	    arr.add(9);
	    int n=sc.nextInt();
	    System.out.println(fun(arr,n));
	    
	}
}