import java.util.Scanner;

public class DivisibleBy5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of element");
		int n= sc.nextInt();
		 int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = sc.nextInt();
	        }
	       int count =0;
	       for (int i = 0; i < n; i++)
	       {
	    	   if(a[i]%5==0)
	    	   {
	    		   count++;
	    		   
	    	   }
	    	   System.out.println("total no is divisible by 5="+count);
	       }
	}
}