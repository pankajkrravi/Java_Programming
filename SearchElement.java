package com.java.programming.array;

public class SearchElement {

	int search(int []ar,int ele)
	{

		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==ele)
				return i;
		} return -1;
	}
		public static void main(String[] args) {
			MergeArray ma= new MergeArray();
			int ar[]=ma.readarray();
			SearchElement se= new SearchElement();
			int in=se.search(ar, 77);
			if(in==-1)
			{
				System.out.println("element not available");
			}
			else
				System.out.println("element is available");

		}

	}
