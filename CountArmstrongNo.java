import java.util.Scanner;

public class CountArmstrongNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range");
		int n=sc.nextInt();
		int c=countArm(n);
		System.out.println("Total :"+c);
	}
	static int countArm(int n) {
		int count=0;
		for(int i=1;i<=n;i++) 
		{
			boolean a=getArm(i);
			if(a) 
			{
				count++;
				System.out.println("No is:"+i);
			}
		}
		return count;
	}
	static boolean getArm(int n)
	{
		int t=n,sum=0;
		int p=getCount(n);
		while(t!=0)
		{
			int r=t%10;
			sum=sum+getPow(r,p);
			t=t/10;
		}
		return sum==n;
	}
	static int getPow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	static int getCount(int x)
	{
		int count=0;
		while(x!=0)
		{
			x=x/10;
			count++;

		}
		return count;
	}
}
