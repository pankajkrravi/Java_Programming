package com.java.programming;
public class Martics90degree {
	public static void main(String[] args) {
	MatricsAddition ma= new MatricsAddition();
	int ar[][]=ma.readMat();
	System.out.println("Your matrics is before reversing 90*: ");
	ma.displayMat(ar);
	System.out.println("your matrics after reversing 90*");
	reverse90(ar);
	ma.displayMat(ar);
}
	private static void reverse90(int[][] ar) {
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)     // For 90degree Reverse 
				                                //1. First transpose 2. row reverse 3. display
			{
				int t=ar[i][j];
				ar[i][j]=ar[j][i]; // transpose
				ar[j][i]=t;
			}
			}
		}
	}