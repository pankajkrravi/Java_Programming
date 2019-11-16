import java.util.Scanner;

public class FibnoccitoNnumber {
	 public static void main(String args[])
	    {
		
	        int a=0, b=1, c=0, n;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Upto How Many Term ? ");
	        n = scan.nextInt();
	        
	        /* print the first two terms of the Fibonacci series */
	        
	        System.out.print("Fibonacci Series : " + a + "  " + b + "  ");
	        c = a + b;
	        
	        /* decrease the n by 2, since the first two number 
	         * of the Fibonacci series already printed manually
	         */
	        
	        n = n - 2;
			
	        while(n>0)
	        {
	            System.out.print(c + "  ");
	            a = b;
	            b = c;
	            c = a + b;
	            n--;
	        }
			
	    }

}
