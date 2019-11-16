import java.util.Scanner;

public class Factorialrec {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		fact(n);
		System.out.println(n*fact(n-1));
	}
	public static int fact(int n)
	{
		if(n==1)
			return 1;
		return n*fact(n-1);
	}

}
