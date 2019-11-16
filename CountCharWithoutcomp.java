import java.util.Scanner;

public class CountCharWithoutcomp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		int count[]=new int[128];
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			count[ch[i]]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println((char)i+" "+"is"+count[i]);
		}
		
	}

}
