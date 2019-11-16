import java.util.Scanner;

public class OccinEachAlpInResp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		int count[]=new int[128];
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				count[ch[i]-65]++;
				
			}
			else if(ch[i]>=97&&ch[i]<=122)
				
			{
				count[ch[i]-97]++;
			}
			
		}
		for(int i=0;i<count.length;i++)
		{
		if(count[i]!=0)
		{
		System.out.println((char)(i+65)+"----"+count[i]);
		System.out.println((char)(i+97)+"----"+count[i]);	
		}
		}
		
	}

}
