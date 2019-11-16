import java.util.Scanner;

public class REmoveBlanksp {
	public static void main(String args[])
	   {
	         
	        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter a Sentence : ");
	      String  str = scan.nextLine();
	      char[] ch = str.toCharArray();
	      
	        StringBuffer sb = new StringBuffer();
	 
	        for (int i = 0; i < ch.length; i++)
	        {
	            if( (ch[i] != ' ') && (ch[i] != '\t') )
	            {
	                sb.append(ch[i]);
	            }
	        }
	 
	        System.out.println(sb); 
	   }

}
