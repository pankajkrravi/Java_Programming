import java.util.Scanner;

public class CountTypeOfCharacter {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the sentence ");
		String str=scan.nextLine();//for sentance
		int uc=0,lc=0,vc=0,cc=0,dc=0,sc=0;
		for (int i = 0; i < str.length(); i++) {
			char ch= str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				uc++;
			 if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vc++;
			 else
				 cc++;
		}
			else if(ch>='a'&&ch<='z')
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='o'||ch=='u')
					vc++;
				else
				cc++;
			}
			else if(ch>='0'&& ch<='9')
				dc++;
			else
				sc++;
			
					
		}
		System.out.println("number of capital letter:"+uc);
		System.out.println("number of small letter:"+lc);
		System.out.println("number of vowel letter:"+vc);
		System.out.println("number of consonent letter:"+cc);
		System.out.println("number of digit :"+dc);
		System.out.println("number of special letter:"+sc);
		
		
		
			
		}
		
}
