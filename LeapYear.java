import java.util.Scanner;

//leap year//
public class LeapYear {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year");
	int y=sc.nextInt();
	boolean rs=isLeapYear(y);
	if(rs)
	{System.out.println(y+"leap yaer");
	
	}
	else
		System.out.println(y+"not leap year");
	
}
static boolean isLeapYear(int yr)
{
	return ((yr%400==0)||(yr%4==0 && yr%100!=0));


}
}
