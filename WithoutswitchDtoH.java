import java.util.Scanner;

public class WithoutswitchDtoH {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int no= sc.nextInt();
		String hex=getDecToHex(no);
		System.out.println(no+"decimal to binary"+" "+hex);
		
	}
	static String getDecToHex(int dec)

	{
		String hex="";
		while(dec!=0)
		{
			int r=dec%16;
			if(r<10)
			{
			hex= r+hex;
			}
			else
			{
				hex=(char)(r+55)+hex;
			}
				dec=dec/16;
			

		}
		return hex;
	}
}
