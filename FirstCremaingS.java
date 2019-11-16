import java.util.Scanner;

public class FirstCremaingS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your sentence");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		String s=initCap(str);
		System.out.println("converted string"+s);

	}
	static String initCap(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				if (ch[i]>'a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else 
			{
				if(ch[i]>65&&ch[i]<90)
					ch[i]=(char)(ch[i]+32);
			}

		}
		st=new String(ch);
		return st;


		/* st="";
		for(int i=0;i<ch.length;i++)
		{
			st=st+ch[i];
		}*/

	}
}
