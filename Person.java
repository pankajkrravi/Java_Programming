import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		System.out.println("enter the age");
		Scanner sc= new Scanner(System.in );
		int age=sc.nextInt();
		if (age>=18)
			System.out.println("elligible to vote");
		else
			System.out.println("not elligible to vote");
		System.out.println("thankyou");
	}
	

}
