 import java.util.Scanner;

public class annagram_new {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1");
		
		String st1=sc.nextLine();
		System.out.println("enter the string2");
		
		String st2=sc.nextLine();
		boolean rs= isAnagram(st1,st2);
		if(rs)
			System.out.println("is anagram ");
		else
			System.out.println("is not anagram ");
	}
	static boolean isAnagram(String s1,String s2)
	{
		int c1[]=noofoccerence(s1);
		int c2[]=noofoccerence(s2);
		for(int i=0;i<c1.length;i++)
		{
                			if(c1[i]!=c2[i])
				return false;
		}
		return true;
		
	}
	static int[] noofoccerence(String s)
	{
	int c[]=new int[26]; 
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch>='A'&&ch<='Z')
					c[ch-65]++;
				else if(ch>='a'&&ch<='z')
					c[ch-97]++;
				
			}
	return c;
	}

}

