import java.util.Scanner;

public class DivisibleBy3 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no");
	int no= sc.nextInt();
	getNoisDivisible(no);

	
}
static void getNoisDivisible(int n){
	System.out.println("no is divisible by 3=");
	for (int c=1; c<n; c++) {
			if (c%3==0) 
				System.out.print("  "+c);
				
}
}
}



