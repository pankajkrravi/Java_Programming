import java.util.Scanner;

public class SpecialNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int no =sc.nextInt();
		getSpecial(no);
}
	static void getSpecial(int n)
	{
		int x=n%10;
		int y=n/10;
		int result=(x+y)+(x*y);
		if (n==result)
			System.out.println(result+" no is special ");
		else
			System.out.println(result+" no is not special=");
	}
}