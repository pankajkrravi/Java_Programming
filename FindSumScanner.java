import java.util.Scanner;

public class FindSumScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter your "+ n +"values");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+ar[i];
		}
System.out.println("sum of "+ n +" element="+sum);
System.out.println("avgof "+ n +" element="+sum/(double)n);
	}

}
