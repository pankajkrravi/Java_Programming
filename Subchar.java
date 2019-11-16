import java.util.Scanner;

public class Subchar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String reverse = " ";
		int count = 0;
		System.out.println("Enter a string");
		String s = sc.nextLine();
		for (int i = s.length() - 1; i >= 0; i--) {
		reverse = reverse + s.charAt(i);
		}
		reverse.toString();
		System.out.println("enter the character");
		char c = sc.next().charAt(0);
		for (int i = 0; i < reverse.length(); i++) {
		if (c == reverse.charAt(i)) {
		if (count == 0) {
		int x = s.length() - reverse.indexOf(c);
		System.out.print(x);
		count++;
		}
		}
		}

		if (count == 0) {
		System.out.println("-1");
		}
		}
		}


