import java.util.Scanner;

public class CountcharacterOccuranc {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the sentence ");
		String str=scan.nextLine();
		char ch[]=str.toCharArray();
		int n=ch.length; 
		for (int i = 0; i <n; i++) {
			int count=1; 
			for (int j = i+1; j < n; j++) {
				if(ch[i]==ch[j])
				{
					 count++;
					 ch[j]=ch[--n];
					 j--; 
				}
				
			}
			System.out.println(ch[i]+"----->"+count);
				
			}
		}
	
}
