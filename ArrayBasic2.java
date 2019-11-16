package com.java.programming.array;

public class ArrayBasic2 {
public static void main(String[] args) {
	int arr[]= {55,42,98,78,56};
	System.out.println("No of elements in array is:"+arr.length);
	for(int i=0;i<arr.length;i++)
	{	
		System.out.println(i+"-->"+arr[i]);
	}
	System.out.println("-----------------------------------------");

	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(i+"-->"+arr[i]);
	}
}
}
