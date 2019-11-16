import java.util.Scanner;

public class Convrt {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int dec= sc.nextInt();
		int base= sc.nextInt();
		String c=getConvert(dec,base);
		System.out.println(dec+" "+base +"decimal to binary"+" "+c);
		
	}
	static String getConvert(int d,int b)

	{
		String con="";
		while(d!=0)
		{
			int r=d%16;
			if(r<10)
			{
			con= r+con;
			}
			else
			{
				con=(char)(r+55)+con;
			}
				d=d/16;
			

		}
		return con;
	}
}


