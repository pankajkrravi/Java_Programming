import java.util.Scanner;

public class CountBiggestWord {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the sentence ");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		String big="";
		for (int i = 0; i < ch.length; i++) {
			String w="";
       while(i<ch.length&& ch[i]!=' ')//space 
       {
    	   w=w+ch[i];
    	   i++;
       }  
       if(big.length()<w.length())
    	   big=w;
		}
       System.out.println("biggest word is :"+big);
       System.out.println("lenght of word is :"+big.length());
	}
		}
	




