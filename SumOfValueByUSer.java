package com.java.programming.array;

import java.util.Scanner;

public class SumOfValueByUSer {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the value of n");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the values for n");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<n;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("Sum of the values are:"+sum);
	System.out.println("Average of the values are:"+sum/(double)n);
}
}