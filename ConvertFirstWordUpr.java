import java.util.Scanner;

public class ConvertFirstWordUpr {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the sentence ");
		String str=scan.nextLine();
		String s=intCap(str);
		System.out.println(s);
}
private static String intCap( String st) {
	char ch[]=st.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
		{
			if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
			}
		else if(ch[i]>=65&&ch[i]<=90)
           ch[i]=(char)(ch[i]+32);			
		}
	//character array into string
st=new String(ch);
return st;
}
}
