 import java.util.Scanner;

public class StringPragram {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentance   ");
	String str=sc.nextLine();
boolean rs=isPragaram(str);
if(rs)
	System.out.println("true");
else
	System.out.println("false");
	}

public static boolean isPragaram(String st)
{
	if(st.length()<26){
		return false;
	}
int c[]=new int[26];

	for(int i=0;i<c.length;i++)
	{
		
	char ch=st.charAt(i);
	
		if (ch>=65&&ch<=90)
		{
			c[ch-65]++;
		
		}
		else 
		if(ch>=97&&ch<=122)
		{
			c[ch-97]++;
		}
		for (int j = 0; j < c.length; j++) {
			if(c[i]==0)
				return false;
		}
	
}
	return true;	
}
}

