import java.util.Scanner;

public class DisplayFactorialNo {

	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter the number whose factorial is to be found: ");
	       int n = scanner.nextInt();
	       getFactorial(n);
	     
	   }
	     static void  getFactorial(int ns)
	   	{
	   	
	    	 long f=1;
	   		long i;
	   		for ( i = 1; i <= 5; i++)
	   		{
	   		while(ns>1)
	   		{
	   			f=f*ns;
	   			ns--;
	   			i=i*f;
	   		
	   		}
	   	        System.out.printf("%4d%,30d\n", i, f);
	   	}
}
}