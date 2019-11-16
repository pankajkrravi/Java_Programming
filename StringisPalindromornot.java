import java.util.Scanner;



public class StringisPalindromornot {
	public static void main(String[] args) {
		System.out.println("enter the sentense");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean rs=check(str);
		if (rs)
			System.out.println("string is Palindrome");
		else
			System.out.println("string is not  Palindrome");
	}
	 static boolean check(String str)
	 {
		 String st1=" ";
		 
		 for (int i =str.length()-1;i<str.length()/2;i-- )
		 {
			 st1=st1+str.charAt(i);
			 
		 }
		 return st1.equals(str);
				
		 
	 }

}
