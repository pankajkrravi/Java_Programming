import java.util.Scanner;

public class SanjuWedsGeeta {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		getDivisibleBy(no);

	}
	static void getDivisibleBy(int n)
	{
		for(int i=0;i<=n;i++)
		{

		 if(n%3==0)
			{
				System.out.println("sanju");

			}
			else if(n%5==0)
			{
				System.out.println("geeta");

			}
			else	if(n%3==0 && n%5==0)
		{
			System.out.println("sanju weds geeta");
		}
		else
		{
			System.out.println("notthing");
		}
	}
	}
}
