import java.util.Scanner;

public class AngleBtHrMint {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int hr= sc.nextInt();
		int mnt= sc.nextInt();
		double hour=hr*30+mnt*0.5;
		double min=mnt*6;
		double angle=0;
		if(hour> min)
			angle=hour-min;
		else
			angle= min=hour;
		if(angle>180)
			angle=360-angle;
		System.out.println(angle);
	}
		
			
		
	}
