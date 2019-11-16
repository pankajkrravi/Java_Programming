import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int[]arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("entr the element ");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int p=0;
			for(int j=2;j<i;j++)
			{
				if(arr[i]%j==0)
					p=1;
			}
			if(p==0)
					System.out.println(arr[i]);
				
			}
		
	
	}

}
