//reverse the no//
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int no=sc.nextInt();
	int rev=0;
while(no>0)
{
	
	int r=no%10;
	rev=rev*10+r;
	no=no/10;


}

System.out.println("no is reverse="+ rev);
}
}
