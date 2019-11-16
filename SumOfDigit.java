import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		int sum=getSumOfdigits(no);
		System.out.println(no+ " "+"sum of digit is"+" " +sum);
	}

	static int getSumOfdigits(int n){
		int sum=0;
		do{
			int r=n%10;
			sum= sum+r;
			n=n/10;

		}while(n!=0);
		return sum;
	}
}