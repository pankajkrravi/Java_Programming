package com.java.programming.array;

public class ZigZag {
	public static void main(String[] args) {
		int a[]= {56,78,18,89,32,59};
		int b[]= {28,52,17,12};
		int c[]=zigzag(a,b);
		System.out.println("Array in ZigZag Order is="+c);
	}
	private static int[] zigzag(int[] a, int[] b) {
		int rs[]= new int[a.length+b.length];
		int i=0,j=0;
		for(;i<a.length&&i<b.length;i++,j++)
		{
			rs[i]=a[i];
			j++;
			rs[i]=b[i];
		}
		for(;i<b.length;i++,j++)
		{
			rs[j]=b[i];
		}
		for(;i<a.length;i++,j++) 
		{
			rs[j]=a[i];	
		}
		return rs;
	}
}