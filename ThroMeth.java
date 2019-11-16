import java.util.Scanner;

public class ThroMeth {
	static boolean checkeligibility(int x)
	{
		return(x>=18);
	}
public static void main(String[] args) {
	
	System.out.println("enter the age");
	Scanner sc=new Scanner(System.in );
	int age= sc.nextInt();
	boolean rs=checkeligibility( age);
	if (rs)
		System.out.println("elligible");
	else
		System.out.println("not elligible");
	
	
	}

}


