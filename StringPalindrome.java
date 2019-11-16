import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		sc.close();
		boolean rs=getpalindrome(s);
		if(rs)
			System.out.println("string is palindrome");
		else
			System.out.println("string is not palindrome");

	}

	private static boolean getpalindrome(String s) {
		{
			String rev="";
			for(int i=s.length()-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);	
			}
			return rev.equals(s);
		}
	}
}
	

