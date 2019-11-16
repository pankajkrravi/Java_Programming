import java.util.Scanner;

public class Stringrev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String reverse = " ";
		
		System.out.println("Enter a string");
		String s = sc.nextLine();
		for (int i = s.length() - 1; i >= 0; i--) {
		reverse = reverse + s.charAt(i);
		
		}
		System.out.println("reverse a string"+reverse );
	}
}


