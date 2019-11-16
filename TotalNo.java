import java.util.Scanner;

public class TotalNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string ");
		String st=sc.next();
		int n=getResult(st);
		System.out.println(n);
		

}

	public static int getResult(String st) {
		char ch[]=st.toCharArray();
		int no=0;
		for(int i=0;i<ch.length;i++)
			while ( ch[i]=='.')
			{
				no=no+2;
		          i++;
		
	}
		return no;
	}
}
