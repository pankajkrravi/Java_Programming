import java.util.Scanner;

public class countvovinsen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter the sentence");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int	count =0;
		for(int i=0;i<ch.length-1;i++)
		{
			
			
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
					count++;
					
				
			}
			System.out.println("number of vowel="+count);
			

	}

}
