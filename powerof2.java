import java.util.Scanner;

public class powerof2 {
	 public static void main(String args[])  
	    {  

	        Scanner in=new Scanner(System.in);
	        System.out.println("Enter the number : ");
	        int num = in.nextInt();

	        int other = 1;  
	        if(((~num) & 1) == 1)  
	        {  
	            System.out.println("The number is a power of two");  
	        }  
	        else  
	        {
	            System.out.println("The number is a  NOT A power of two");  
	        }
	    }  

}
