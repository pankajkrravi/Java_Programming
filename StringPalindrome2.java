//without reveres function 
import java.util.Scanner;

public class StringPalindrome2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("enter the string ");
		String nm=sc.next();
		boolean  rs=getPalindron(nm);
		if(rs)
		{
			System.out.println(" string is palindrom" );
		}
		else
		{
			System.out.println(" string is not palindrom");
		}
		
	}
	public static boolean getPalindron(String st)
	{                                                   
	int i=0;
		while(i<st.length()/2)
		{
			if(st.charAt(i)!=st.charAt(st.length()-1-i))
				
		return false;
		i++;	
	}
		return true;
	}

}
