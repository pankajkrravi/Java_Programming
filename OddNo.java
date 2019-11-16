import java.util.Scanner;

public class OddNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no ");
		int no=sc.nextInt();
		/*getCountNoOfDigit(no);

}
	static void getCountNoOfDigit(int n)
	{
		int odc=0;
		do 
		{
			int r=n%10;
			if(r%2!=0)
		      odc++;
			 n=n/10;
			
		}while(n!=0);*/
		if(no%2!=0)
		//System.out.println("count odd no="+odc);
		{System.out.println("no is odd");
		}
		else
		{ System.out.println("no is not odd");
		}
		}
	}

	
