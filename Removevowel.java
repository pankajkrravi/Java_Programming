package matrix;

import java.util.Scanner;

public class Removevowel {
	public static void main(String[] args) {
		int i,j=0;
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter the sentence");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		char ch2[]=new char[80];
		for( i=0;i<ch.length;i++)
		{
			/*int	count =0;
			String w=" ";
			while(i<ch.length&&ch[i]!=' ')//space
			{*/
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
					/*count++;
					w=w+ch[i];
				i++;*/{
				continue;
			}
			
		else
		{
			ch2[j]=ch[i];
			j++;
			
		}
		}
		System.out.println(ch2);

	}
}


