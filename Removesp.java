package matrix;

import java.util.Scanner;

public class Removesp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter the sentence");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int n=ch.length;
		String st1="";
		for(int i=0;i<n;i++)
		{
			if(ch[i]==' ')
			{
				continue;
			}
			else
			{
			st1=st1+ch[i]	;
			}
				
		}
		System.out.println(st1);
	

}
}
