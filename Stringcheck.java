      import java.util.Scanner;

public class Stringcheck {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the  first sentence ");
		String str1=scan.nextLine();
		System.out.println("enter the second sentance");
		String str2=scan.nextLine();
		boolean rs=isCheck(str1,str2);
		if(rs)
			System.out.println("true");
		else
			System.out.println("false");
	}
public static boolean isCheck(String s1,String s2)
{
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	for (int i = 0; i < c1.length; i++) {
		int j=0,k=i;
		while(j<c2.length&&k<c1.length&&c1[k]==c2[j])
		{
			k++;
			j++;
		}
		if(j==c2.length)
			return true;
	}
	return false;
		
	}
}