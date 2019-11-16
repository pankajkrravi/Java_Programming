import java.util.Scanner;

public class CountVowelinword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter the sentence");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
			int	count =0;
			String w=" ";
			while(i<ch.length&&ch[i]!=' ')//space
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
					count++;
					w=w+ch[i];
				i++;
			}
			System.out.println(w+" "+"number of vowel="+count);
		}	

	}

}
