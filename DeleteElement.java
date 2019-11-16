package com.java.programming.array;
public class DeleteElement 
{
	int[]	delete(int x[],int in)
	{
		if(in<0||in>=x.length)
		{
			System.out.println("index not in the range");
			return null;
		}
		int no[]=new int[x.length-1];
		for(int i=0;i<no.length;i++)  //  use na.length instead of x.length
		{
			if(i<in)
				no[i]=x[i];
			else
				no[i]=x[i+1];
		}
		return no;
	}
	public static void main(String[] args) {
		MergeArray ma= new MergeArray();		
		int ar[]=ma.readarray();
		DeleteElement de= new DeleteElement();
		int arr[]=de.delete(ar, 2);
		if(ar==null)
			System.out.println("Deletion is Successful");
		else
			System.out.println("After Deletion");
	      	ma.displayarr(arr);
	}
}