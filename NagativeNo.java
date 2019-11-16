import java.util.Scanner;

public class NagativeNo {
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
	 sc.close();
	       for (int i = 0; i < n; i++)
	       {
	    	   if(a[i]<=0)
	    	   
	    	   System.out.println("no is nagative="+a[i]);
	       }
	}
}

