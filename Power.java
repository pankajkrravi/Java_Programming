import java.util.Scanner;

public class Power {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the two no");
int n=sc.nextInt();
int p=sc.nextInt();
int rs= getPower(n,p);
System.out.println("power of "+n +" " +"is="+rs);
}
static int getPower(int no,int pow)
{
	int pw=1;
	while(pow>0)
	{
		pw=pw*no;
		pow--;
	}
	return pw;
}
}
