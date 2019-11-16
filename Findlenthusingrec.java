import java.util.Scanner;

public class Findlenthusingrec {
	 private static int recLen(String str) 
	    {
	 
	        // if we reach at the end of the string
	        if (str.equals(""))
	            return 0;
	        else
	            return recLen(str.substring(1)) + 1;
	    }
	 
	    /* Driver program to test above function */
	    public static void main(String[] args) 
	    {
	 
         Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter a Sentence : ");
	      String  str = scan.nextLine();  
	       
	        System.out.println(recLen(str));
	    }

}
