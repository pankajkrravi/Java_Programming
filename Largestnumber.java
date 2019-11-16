import java.util.Scanner;

public class Largestnumber {
	public static void main(String[] args) {
		System.out.println("enter the no  of element ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the value ");
		int[] a=new int[30];
		for(int i=0;i<n;i++)
			 a[i]=sc.nextInt();
		int big=0;
		for(int i=0;i<n;i++)
		{
			if(big<a[i])
			{
				big=a[i];
			}
		}
		System.out.println("biggest element in number="+big);
		
	}

}
