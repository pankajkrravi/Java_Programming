package com.java.programming.array;

public class InsertElement {
	int[]	insert(int x[],int in, int ele)
	{
		if(in<0||in>x.length)
		{
			System.out.println("index not in the range");
			return null;
		}
		int no[]=new int[x.length+1];
		for(int i=0;i<x.length;i++)
		{
			if(i<in)
				no[i]=x[i];
			else
				no[i+1]=x[i];
		}
		no[in]=ele;
		return no;
	}
	public static void main(String[] args) {
		MergeArray ma= new MergeArray();
		int x[]=ma.readarray();
		InsertElement ie=new InsertElement();
		int[] ar=ie.insert(x, 2, 35);
		if(ar==null)
			System.out.println("Insertion is failed");
		else
			System.out.println("Insertion is Successful");
		ma.displayarr(ar);
	}
}
  