import java.util.Scanner;

public class Pratice {
	private void nextChar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String str2 = "";

		for (int i = 0; i < str.length(); i++) {
		char chr = str.charAt(i);
		int ascii = (int) chr;
		int b1 = (ascii + 1);
		String s = String.valueOf((char) b1);
		str2 = str2 + s;
		}
		System.out.println("The corresponding individual next letters of the given input string is:" + str2.toLowerCase());
		}

		public static void main(String args[]) {

			Pratice p = new Pratice();

		p.nextChar();

		}

}
