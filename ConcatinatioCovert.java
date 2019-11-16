import java.util.Scanner;

public class ConcatinatioCovert {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int dec= sc.nextInt();
		System.out.println("enter the base");
		int base= sc.nextInt();
		String c=getConvert(dec,base);
		System.out.println("decimal no"+dec+" base is "+base +"decimal to binary"+" "+c);
		
	}
	static String getConvert(int d,int b)

	{
		String st="0123456789ABCDEF";
		String con="";
		while(d!=0)
		{
			int r=d%16;
			con= st.charAt(r)+con;
		    d=d/b;
}
		return con;
	}
}
