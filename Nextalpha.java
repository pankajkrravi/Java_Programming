package matrix;

import java.util.Scanner;

public class Nextalpha {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your sentence");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[i]++;
		
		System.out.print(ch[i]++);
		}

	}

}
