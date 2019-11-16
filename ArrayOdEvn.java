import java.util.Scanner;

public class ArrayOdEvn {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of element");
		int n= sc.nextInt();
		int ar[]= new int[n];
		System.out.println("enter the value");
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
			
			}
		int codd=0,cevn=0;
		
		for (int i = 0; i < n; i++)
		{
			if(ar[i]%2==0)
			{
				cevn++;
			}
			else
			{
				codd++;
			}
		}
			System.out.println("even no"+cevn);
			System.out.println("odd no"+codd);
		
	}
	
}
