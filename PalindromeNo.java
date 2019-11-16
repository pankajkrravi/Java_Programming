import java.util.Scanner;

//palindrome no//
public class PalindromeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		boolean pd=isPalindrome(no);
		if(pd)
			System.out.println(no+"is palindrome");
		else
			System.out.println(no+"is not palindrome");
	}
	static boolean isPalindrome(int n)
	{
	return n==reverse(n);
	}
	
		static int reverse(int n)
		{
		int rev=0;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
		
		}
	}


