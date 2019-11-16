import java.util.Scanner;

public class prog3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of elements");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter your "+ n +"values");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
	
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(ar[i]%5==0)
				count++;
		}
		System.out.println("total numbers divisible by 5 is="+count);
		}
		

}
