import java.util.Scanner;

public class CheckCharacter {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the  first sentence ");
		String str1=scan.nextLine();
		System.out.println("enter the second sentance");
		String str2=scan.nextLine();
		int rs=count(str1,str2);
		System.out.println(rs);
	}
public static int count(String s1,String s2)
{
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	int c=0;
	for (int i = 0; i < c1.length; i++) {
		int j=0,k=i;
		while(j<c2.length&&k<c1.length&&c1[k]==c2[j])
		{
			k++;
			j++;
		}
		if(j==c2.length)
			c++;
	}
	return c;
		
	}
}
