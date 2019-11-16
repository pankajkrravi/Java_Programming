import java.util.Scanner;

      public class CountVowelInWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence ::");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int c=0;	//String str=" ";
			while(i<=s.length()-1 && s.charAt(i)!=' ')
			{				
				if ( s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||  s.charAt(i)=='o'||  s.charAt(i)=='u'|| s.charAt(i)=='A'||  s.charAt(i)=='E'||  s.charAt(i)=='I'||  s.charAt(i)=='O'||  s.charAt(i)=='U'   ) 
				{		
					c++;
					
				}
				i++;
			}
			if(c>0)
				System.out.println("Vowel"+"="+c);
		}
	}
}
