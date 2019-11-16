
//biggest no among 3//
import java.util.Scanner;
public class BiggestNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the three no ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		getBiggestNo(a,b,c);

	}
	static void getBiggestNo(int x,int y,int z )
	{
		if(x>y)
		{
			if(x>z)
			{
				System.out.println(x+ "is biggest");
			}
			else
			{
				System.out.println(z+" is biggest");
			}
		}

		else
		{
			if(y>z)
			{
				System.out.println(y + "is biggest");
			}
			else
			{
				System.out.println(z+"is biggest");
			}
		}


	}
}
