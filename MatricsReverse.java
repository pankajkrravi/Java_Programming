package com.java.programming;
public class MatricsReverse {
public static void main(String[] args) {
	MatricsAddition ma= new MatricsAddition();
	int ar[][]=ma.readMat();
	System.out.println("Your matrics is before Reverse: ");
	ma.displayMat(ar);
	System.out.println("your matrics after Reverse");
	rowReverse(ar);
	ma.displayMat(ar);
}
private static void rowReverse(int[][] ar) {
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<ar[i].length/2;j++)
		{
		int t= ar[i][j];
		ar[i][j]=ar[i][ar[i].length-1-i];
		ar[i][ar[i].length-1-j]=t;
		}
	}
}
}
