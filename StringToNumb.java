import java.util.Scanner;

public class StringToNumb {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string ");
		String st=sc.next();
		 sumOfNo(st);
	
}

	public static void sumOfNo(String st) {
	int no=0;
	for(int i=0;i<st.length();i++)
	{
		char ch=st.charAt(i);
		no=no*10+(ch-48);
	}
	System.out.println(no); 
	}
	}
