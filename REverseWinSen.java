import java.util.Scanner;

public class REverseWinSen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your sentence");
		String str=sc.nextLine();
		sc.close();
		String s=reverse(str);
		System.out.println("reverse sentense is:"+s);
	}

	static String reverse(String st){
		String rs="";
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k){
				rs=rs+ch[j];
				j--;
			}
			if(i<ch.length)
				rs=rs+ch[i];
		}
		return rs;
	}

}
