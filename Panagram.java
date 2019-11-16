import java.util.Scanner;
//examp:the quick brown fox jumps over the lazy dog//

public class Panagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		boolean rs= isPanagram(st);
		if(rs)
			System.out.println("is Panagram ");
		else
			System.out.println("is not Panagram ");
		
	}
		static boolean isPanagram(String st)
		{
			if(st.length()<26)
				return false;
			int c[]=new int[26];
					for(int i=0;i<st.length();i++)
					{
						char ch=st.charAt(i);
						if(ch>=65&&ch<=90)
						{
							c[ch-65]++;
						}
						else
							if(ch>=97&&ch<=122)
							{
								c[ch-97]++;
							}
					}
			for(int i=0;i<c.length;i++)
			{
				if(c[i]==0)
					return false;
			}


		

		return true;

	}

}
