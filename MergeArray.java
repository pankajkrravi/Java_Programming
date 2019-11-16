package com.java.programming.array;
import java.util.Scanner;
public class MergeArray {
	int[]	readarray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter how many elements");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the value for n");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	void displayarr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}System.out.println();
	}
	int []	mergeArray(int x[],int y[])
	{
		int z[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++)
		{
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			z[x.length+i]=y[i];
		}
		return z;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		MergeArray m= new MergeArray();
		int a[]=m.readarray();
		int b[]=m.readarray();
		int rs[]=m.mergeArray(a, b);
		m.displayarr(rs);	}
}
