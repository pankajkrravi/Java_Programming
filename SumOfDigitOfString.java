//ip-asd23jh5,op-28//

import java.util.Scanner;
 
public class SumOfDigitOfString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string ");
		String st=sc.next();
		int n= sumOfNo(st);
		System.out.println(n);
		}

	public static int sumOfNo(String st) {
		char ch[]=st.toCharArray();
	int sum=0;
	for(int i=0;i<ch.length;i++)
	{
		int  no=0;
		while (i<ch.length&&ch[i]>='0'&&ch[i]<='9') {
			
		no=no*10+(ch[i]-48);
		i++;
	}
sum= sum+no; 

	}
	return sum;
	}


}
