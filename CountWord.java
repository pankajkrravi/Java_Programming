import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the sentence ");
		String str=scan.nextLine();
		char ch[]=str.toCharArray();//convert string to char//
		int wc=0;
		for (int i = 0; i < ch.length; i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				wc++;
				
			}
			
		}
		System.out.println("number of word: "+wc);
			
		}
				
}