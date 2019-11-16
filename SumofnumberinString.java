import java.util.Scanner;

public class SumofnumberinString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentecen");
		String st=sc.nextLine();
		int c=getSum(st);
		System.out.println(c);
		
	}
	public static int getSum(String s)
	{
	char ch[]=s.toCharArray();
	int sum=0;
	for(int i=0;i<ch.length;i++)
	{
	int no=0;
	while(i<ch.length&&ch[i]>='0'&&ch[i]<='9')
	{
		no=no*10+(ch[i]-48);
		i++;
		
	}
	sum=sum+no;
	}
	return sum;
	
	}

}
