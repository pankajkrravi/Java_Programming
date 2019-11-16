
import java.util.Scanner;

public class HappyNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		boolean rs =isHappy(no);
		if(rs)
			System.out.println(no+" "+"is happy number.");	
		else
			System.out.println(no+" "+"is not happy number.");
	}
	static boolean isHappy(int n)
	{
		while(n>9)
		{
			n=sumOfSqDigits(n);

		}
		return n==1||n==7;
	}
	static int	sumOfSqDigits(int n)
	{
	int sum=0;
	do{
		int r=n%10;
		sum= sum+r*r;
		n=n/10;

	}while(n!=0);
	return sum;
}
}
