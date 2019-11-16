import java.util.Scanner;

public class Calculatenumberinstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentecen");
		String st=sc.nextLine();
		int no=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			no=no*10+(ch-48);
		}
		System.out.println(no);
		System.out.println(no+10);
		System.out.println(st+10);
		

	}
	
}
