import java.util.Scanner;

public class Contcharinwordinsent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int  count=0;
				String w="";
	
				
				
				while(i<ch.length&& ch[i]!=' ')
				{
				w=w+ch[i];
				i++;
				count++;
				}
				if(count>0)
				{
					System.out.println(w+"-------"+count);
				}
		}
		
			
			
			
		}
		
	}
	

