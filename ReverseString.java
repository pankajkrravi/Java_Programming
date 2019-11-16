import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		boolean rs=getReverse(s);
		if(rs)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
		
	}

	private static boolean getReverse(String st) 
	{
		int i=0;
		while(i<st.length()/2)
		{
		for(i=0;i<st.length();i++)
			if(st.charAt(i)!=st.charAt(st.length()-1-i))
				return false;
		i++;
		}
		return true;
		
	}

}
