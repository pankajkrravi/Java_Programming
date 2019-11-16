import java.util.Scanner;

public class DecToBinary {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int no= sc.nextInt();
		String bin=getDecToBinary(no);
		System.out.println(no+"decimal to binary"+" "+bin);
		
	}
static String getDecToBinary(int dec)

{
	String bin="";
	while(dec!=0)
	{
		int r=dec%2;
		bin= r+bin;
		dec=dec/2;
	}
	return bin;
}
}
