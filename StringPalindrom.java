
//string palindrome
import java.util.Scanner;

public class StringPalindrom {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the string ");
	String nm=sc.next();
	boolean  rs=getPalindron(nm);
	if(rs)
	{
		System.out.println("palindron" );
	}
	else
	{
		System.out.println("not");
	}
	
}
public static boolean getPalindron(String st)
{
	String rev ="";
	for (int i = st.length()-1; i>=0; i--) {
		rev=rev+st.charAt(i);
		
		}
	return rev.equals(st);
}
}
