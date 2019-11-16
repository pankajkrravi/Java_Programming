import java.util.Scanner;

//method return middle value//
public class MiddleValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		getMiddle(a,b,c);

	}
	static void getMiddle(int x,int y,int z) 

	{
		if((x<y && x>z)||(x>y && x<z))
		{
			System.out.println(x + "is middle");
		}
		else if((y<z && y>x)||(y>z && y<x))
		{
			System.out.println(y + "is middle");
		}
		else
		{
			    System.out.println(z + "is middle");
		}
	}
}
