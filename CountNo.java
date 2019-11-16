import java.util.Scanner;

public class CountNo {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the no ");
int no=sc.nextInt();
int c=getCountNoOfDigit(no);
System.out.println(no+" total digit is="+c);

}
static int getCountNoOfDigit(int n)
{
	int dc=0;
	do 
	{
		dc++;
		n=n/10;
		
	}while(n!=0);
	return dc;
	
}

}
