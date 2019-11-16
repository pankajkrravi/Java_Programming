import java.util.Scanner;

public class Countcharinword {
	public static void main(String[] args) {
		System.out.println("enter the sentence");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			String st1="";
			while(i<ch.length&&ch[i]!=' ')
			{
				st1=st1+ch[i];
				count++;
		       i++;
			}
			if(count>=0)
				System.out.print(st1+count+" ");
			
		}
		
		
	}

}
