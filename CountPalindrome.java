
	import java.util.Scanner;

	public class CountPalindrome {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the range from 100 :: ");
			int n=sc.nextInt();
			if(n>99 ) {
				int c=countPal(n);
				System.out.println("Total Palindrome no between 100 to "+n+ " is::"+c);
			}
			else
				System.out.println("Wrong value");
		}
		static int countPal(int range) {
			int count=0;
			for(int i=100;i<=range;i++)
			{
				int r=getRev(i);
				if(r==i)
				{
					count++;
					System.out.println("No is Palindrome :"+i);
				}
			}
			return count;

		}
		static int getRev(int x)
		{
			int rv=0;
			do {
				int r=x%10;
				rv=rv*10+r;
				x=x/10;
			}while(x!=0);
			return rv;
		}
	}


