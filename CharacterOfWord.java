import java.util.Scanner;

public class CharacterOfWord {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the sentence ");
		String str=scan.nextLine();
		char ch[]=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			String w="";
      while(i<ch.length&& ch[i]!=' ')//space 
       {
    	   w=w+ch[i];
    	   i++;
	    count++;                    
       }
       if(count>0)
       System.out.println(w+"------>"+count);
		}
	}
}

