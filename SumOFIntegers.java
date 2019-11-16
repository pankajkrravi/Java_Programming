package com.java.programming.array;

public class SumOFIntegers {
	public static void main(String[] args) {
		int ar[],sum=0;
		ar= new int[5];
		ar[0]=45;
		ar[1]=56;
		ar[2]=52;
		ar[3]=95;			
		ar[4]=89;
		for(int i=0;i<5;i++)
		{
			sum=sum+ar[i];
		}
	System.out.println("Sum of the interger values are="+sum);
	System.out.println("Average of the integer values are="+sum/5.0);
	}
}