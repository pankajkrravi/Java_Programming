package com.java.programming;
public class ColumnReverse {
	public static void main(String[] args) {
		MatricsAddition ma= new MatricsAddition();
		int ar[][]=ma.readMat();
		System.out.println("Your matrics is before column Reverse: ");
		ma.displayMat(ar);
		System.out.println("your matrics after columnReverse: ");
		columnreverse(ar);
		ma.displayMat(ar);
	}
	private static void columnreverse(int[][] ar) {
		for(int i=0;i<ar.length/2;i++)   // access the row.
		{
			for(int j=0;j<ar[i].length;j++) // access the element.
			{
				int t=ar[i][j]; 
				ar[i][j]=ar[ar.length-1-i][j];
				ar[ar.length-1-i][j]=t;
			}
		}
	}
}