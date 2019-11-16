import java.util.Scanner;

public class OctToDecimal {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int no= sc.nextInt();
		int bin=getOctToDec(no);
		System.out.println(no+"decimal to binary"+" "+bin);
		
	}
static int 	getOctToDec( int oct)
{
	int p=0,sum=0;
	while(oct!=0)
	{
		int r=oct%10;
		sum= sum+Pow(8,p)*r;
		p++;
		oct=oct/10;
		
	}
	return sum;
}
static int Pow(int no,int pow)
{
	int pw=1;
	while(pow>0)
	{
		pw=pw*no;
		pow--;
	}
	return pw;
}
}


