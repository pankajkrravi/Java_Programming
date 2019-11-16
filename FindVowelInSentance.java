import java.util.Scanner;

public class FindVowelInSentance {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the sentence ");
		String str=scan.nextLine();
		int vc=0;
		for (int i = 0; i < str.length(); i++) {
			char ch= str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vc++;
			else
				
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					vc++;
			
}
		System.out.println( "vowel of sentance: "+vc);
	}
}
