//count even digit or odd digit in a no3//

import java.util.Scanner;
public class EvenorOddNoCount {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no ");
	int no=sc.nextInt();
	getCountNoOfDigit(no);
	
	}
	static void getCountNoOfDigit(int n)
	{
		int edc=0,odc=0;
		do 
		{
			int r=n%10;
			if(r%2==0)
				edc++;
			else
				odc++;
			 n=n/10;
			
		}while(n!=0);
		System.out.println("count even no="+edc);
		System.out.println("count odd no="+odc);
		
	}

	}



