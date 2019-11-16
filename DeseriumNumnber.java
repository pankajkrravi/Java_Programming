import java.util.Scanner;

public class DeseriumNumnber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int no=sc.nextInt();
	boolean rs=isDeserium(no);
	if(rs)
		System.out.println(no +" is deserium");
	else
System.out.println(no+"is not deserium");	
}
static boolean isDeserium(int no)
{
	int t=no;
	int  c=getCount(no);
	int
}
}
