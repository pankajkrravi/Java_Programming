import java.util.Scanner;

public class CountHappyNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  range::");
		int r=sc.nextInt();
		checkHappy(r);
	}
	static void checkHappy(int range) {
		
		for (int i = 1; i <= range; i++) {
			boolean h = getHappy(i);
			if (h)
				System.out.println(i + " is Happy No");
			//else
			//	System.out.println(i + " is not Happy");
		}
	}
	static boolean getHappy(int no)
	{
			while (no> 9)
			{
				no = sumOfDigitSquare(no);
			} 
			return no==1|| no==7 ; 
				
	}
	
	static int sumOfDigitSquare(int x)
	{
		int sum=0;
		while(x!=0)
		{
			int r=x%10;
			sum=sum+r*r;
			x=x/10;
		}
		return sum;
	}
}


