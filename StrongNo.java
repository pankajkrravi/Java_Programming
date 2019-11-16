  import java.util.Scanner;

public class StrongNo {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();                                                              
		boolean rs=isStrong(no);
		if(rs)
		{
			System.out.println(no+ " is strong no");
		}
		else
		{
			System.out.println(no+" not strong no");
		}

	}
	static boolean isStrong( int n)
	{
		int t=n,sum=0;//assign t because in last iteration n value is zero the we assing n into t//
		while(t!=0)
		{
			int r=t%10;
			sum =sum + fact(r);
			t=t/10;
		}
		return sum==n;

	}
	static int fact(int ns)
	{
		int f=1;
		while(ns>1)
		{
			f=f*ns;
			ns--;
		}
		return f;
	}


}
