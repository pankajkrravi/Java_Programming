import java.util.Scanner;

public class DecToOct{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int no= sc.nextInt();
		String bin=getDecToOct(no);
		System.out.println(no+"decimal to binary"+" "+bin);
		
}
	static String getDecToOct(int dec)

	{
		String bin="";
		while(dec!=0)
		{
			int r=dec%8;
			bin= r+bin;
			dec=dec/8;
		}
		return bin;
	}
	}

