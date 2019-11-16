import java.util.Scanner;

public class CountPrimeNo {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range ::");
		int n=sc.nextInt();
		int c=getCount(n);
		System.out.println("Total:"+c);
	}
	static int getCount(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++) 
		{
			boolean r=getPrime(i);
			if(r==true) 
			{
				count++;
				System.out.println("no is"+i);
			}
		}
		return count;
	}
	static boolean getPrime(int x)
	{
		int c=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				c++;
			}
		}
		return (c==2);

	}
}
