import java.util.Scanner;

public class BiggestPalindrominsen {
	private static boolean  wordispalindrome(String word)
	{
		int count =0;
		String reverse="";
		for(int i=0;i<word.length();i++)
		{
			reverse=reverse+word.charAt(i);
			count++;
			
		}
		if(word.equals(reverse))
		{
			return true;
		}
		else
			return false;
	}
	public static  String longestpalindrom(String sentence)
	{
		System.out.println(sentence.length());
		String longestpalindrom="";
		int i=0;
		while(i<sentence.length())
		{
			String temp="";
			while(i<sentence.length()&& sentence.charAt(i)!=' ')
			{
				temp=temp+sentence.charAt(i);
				i++;
			}
			if(wordispalindrome(temp)&&longestpalindrom.length()<temp.length())
			{
				longestpalindrom=temp;
				
			}
			i++;
			
		}
		return longestpalindrom;
	}
	public static void main(String[] args) {
		
		System.out.println("enter the sentense");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	String st1=	longestpalindrom(str);
		System.out.println(st1);
	}  

}
