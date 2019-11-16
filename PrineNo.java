import java.util.Scanner;

public class PrineNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no ");
		int no=sc.nextInt();
		boolean rs= isPrime(no);
		if(rs)
		{
		System.out.println(no+" prime");
		}
		else
		{
			System.out.println(no+"not prime");
		}
	}

static boolean isPrime(int n)
{
	int c=1,i=1;
	
	for(i=1;i<=n/2;i++)
	//while(i<=n/2)
	{
		if(n%i==0)
		
			c++;
		//i++;
	}
	return c==2;
}
}