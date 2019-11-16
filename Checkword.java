import java.util.Scanner;

public class Checkword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1");
		
		String st1=sc.nextLine();
		System.out.println("enter the string2");
		
		String st2=sc.nextLine();
		int  rs= checkString(st1,st2);
		/*System.out.println(rs);
		/*if(rs)
			System.out.println("true ");
		else
			System.out.println("false");*/
		
	}
	public  static int checkString(String st1,String st2)
	{
	char c1[]=st1.toCharArray();
	char c2[]=st2.toCharArray();
	int count=0;
	for(int i=0;i<c1.length;i++)
	{
		int j=0,k=i;
	
	while(j<c2.length&&k<c1.length&&c1[k]==c2[j])
	{
		k++;
		j++;
	}
	if(j==c2.length)
		count++;
	}
	return count;

}
}
