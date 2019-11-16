import java.util.Scanner;

public class HexToDec {
	public static void main(String[] args) {
		String hex="5Ab3";
		int dec=getHecToDec(hex);
		System.out.println(dec);
		
	}
static	int getHecToDec(String hx)
{
	int p=0,sum=0,i=hx.length()-1;
	while(i>=0){
	
		char ch=hx.charAt(i);
	   i--; 
	   if(ch>='0'&& ch<='9')
		   sum=sum+(ch-48)*pow(16,p);
	   else if(ch>='a'&& ch<='f')
		   sum=sum+(ch-87)*pow(16,p);
	   else
		   sum=sum+(ch-55)*pow(16,p);
	   p++;
}
return sum;
}
static int pow(int no,int po)
{
	int pw=1;
	while(po>0)
	{
		pw=pw*no;
		po--;
	}
	return pw;
}
	
	}

	