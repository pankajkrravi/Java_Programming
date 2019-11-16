import java.util.Scanner;//dynamically access the array

public class ArrayScanner {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no of element");
	int n= sc.nextInt();
	int ar[]= new int[n];
	System.out.println("enter the "+n+"value");
	for (int i = 0; i < n; i++) {
		ar[i]=sc.nextInt();
		
		
	}
	int sum=0;
	for (int i = 0; i < n; i++) {
		sum=sum+ar[i];
		
	}
	System.out.println("sum of"+ n +"elemet="+ sum);
	System.out.println("avarage of"+ n +"element="+ sum/(double)n);
}
}
