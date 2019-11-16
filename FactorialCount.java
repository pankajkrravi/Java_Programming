import java.util.Scanner;

public class FactorialCount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range:");
	int r=sc.nextInt();
	listFact(r);
}
static void listFact(int x)
{
	int count=0;
	for(int i=1;i<=x;i++)
	{
		int a=getFact(i);
		System.out.println(i+" fact is::"+a);
	}
}
static int getFact(int n)
{
	int f=1;
	for(int i=1;i<=n;i++)
	{
		f=f*i;
	}
	return f;
}
}

