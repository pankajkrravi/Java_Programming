package matrix;

import java.util.Scanner;

public class occrencechar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter the sentence");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int n=ch.length;
		int count=1;
		int i;
		for ( i=0;i<n;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
	
			if(count>0)
				System.out.println(ch[i]+"  "+"no of char"+count);
		}
	}
	}


