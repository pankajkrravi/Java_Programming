import java.util.Scanner;

public class DeseriumNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		boolean rs=isDeserium(no);
	
		if(rs)
		{
			System.out.println(no+" deserium");
		}
		else
		{
			System.out.println(no+"  not deserium");
		}
	}
	static boolean isDeserium(int n)
	{
		int t=n,sum=0;
		while(t!=0)
		{
			int r=t%10;;
         int p=0;
			int ab=power(n,p);
			sum =sum + ab;
			t=t/10;
		}
		return sum==n;
	}
	static	int power(int no,int pw)
	{
		int pw1=1;
		while(pw>0)
		{

			pw1=pw1*no;
			pw--;
		}
		return pw1;
	}
}
