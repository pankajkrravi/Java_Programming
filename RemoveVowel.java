import java.util.Scanner;

public class RemoveVowel {
	public static void main(String[] args) {

	System.out.print("Please Enter the Sentence : "); 
    Scanner s=new Scanner(System.in); 
    String word=s.nextLine(); 
    char[] c=word.toCharArray(); 
    char cc[]=new char[80]; 
    int j=0; 
    for(int i=0;i<c.length;i++) 
        { 
            if(c[i]== 'a' || c[i]== 'e' || c[i]=='i' || c[i]== '0' || c[i]== 'u') 
              { 
                  continue; 
              } 
            else 
              { 
                cc[j]=c[i]; 
                 j++; 
               } 
         } 
               System.out.print("After Removeing Vowels from a Sentence : "); 
               System.out.print(cc); 
} 
} 

