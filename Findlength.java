import java.util.Scanner;

public class Findlength {
	 public static void main(String args[])
	   {
	      String str;
	      int len;
	      Scanner scan = new Scanner(System.in);
		  
	      System.out.print("Enter the string : ");
	      str = scan.nextLine();
	      len = str.length();
		  
	      System.out.print("Length of Entered String is " + len);
	   }

}
