import java.util.Scanner;

public class EvenNoSum {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no");
	int no=sc.nextInt();
	int c=getDisplay(no);
	System.out.println("sum of even no is="+c);
}
static int getDisplay(int n)
{
	int sum=0,i;
	for(i=2;i<n;i++)
	if(i%2==0)
	{
		sum=sum+i;
	}
	return sum;
}
}
