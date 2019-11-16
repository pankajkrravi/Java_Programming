import java.util.Scanner;

public class ReverseArray {
	int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter"+n+"values");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
	return ar;
	}
	public void reverse(int x[])
	{
		for(int i=0;i<x.length/2;i++)
		{
			int t=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i]=t;
		}
		
	}
	void display(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}
		System.out.println();
	}
public static void main(String[] args) {
	ReverseArray ra=new ReverseArray();
	int x[]=ra.readArray();
	System.out.print("before reverse");
	ra.display(x);
	System.out.print("after reverse");
	ra.reverse(x);
	ra.display(x);
	
	
	
	
}

}
