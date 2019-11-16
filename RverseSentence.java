import java.util.Scanner;

public class RverseSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		
		char ch[]=st.toCharArray();
		String rs="";
		for(int i=ch.length-1;i>=0;i--)
		{
			int j=i;
			while(i>=0&&ch[i]!=' ')
			{
			i--;	
			}
			int k=i+1;
			while(k<=j)
			{
				rs=rs+ch[k];
				k++;
			}
			if(i>=0)
				rs=rs+ch[i];
				
		}
		System.out.println(rs);
	}

}
