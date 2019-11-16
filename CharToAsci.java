package matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CharToAsci {
	public static void main(String[] args)throws IOException {
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter character");
		String s=buf.readLine();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int j=(int)c;
			System.out.println("asci value of"+c+"="+j);
		}
		
		
	}

}
