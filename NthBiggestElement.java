package com.java.programming.array;
import java.util.Scanner;
public class NthBiggestElement {
	public static void main(String[] args) {
		int ar[]= {56,78,18,89,32,59};
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of the element");
		int a =sc.nextInt();
		int ele= nthBiggest(ar,a);
		System.out.println("Element is="+ele);

	}

	private static int nthBiggest(int[] ar, int i) {
		for(int j=0;j<ar.length;j++)
		{
			int count=0;
			for(int k=0;k<ar.length;k++)
			{
				if(ar[k]>ar[j])
					count++;
			}
			if(count==i-1);
			return ar[i];
		}	
		return 0;
	}
}