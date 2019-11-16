package com.java.programming;

public class Diagonalreverse {
	public static void main(String[] args) {
		MatricsAddition ma= new MatricsAddition();
		int ar[][]=ma.readMat();
		System.out.println("Your matrics is before diagonal Reverse: ");
		ma.displayMat(ar);
		System.out.println("your matrics after diagonalReverse: ");
		diagonalreverse(ar);
		ma.displayMat(ar);
	}
	private static void diagonalreverse(int[][] ar) {
		for(int i=0;i<ar.length/2;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				if(i==j)
				{
					int t=ar[i][j];
					ar[i][j]=ar[ar.length-1-i][ar.length-1-i];
					ar[ar.length-1-i][ar.length-1-j]=t;
				}
				if(i+j==ar.length-1)
				{
					int t=ar[i][j];
					ar[i][j]=ar[j][i];
					ar[j][i]=t;
				}
			}
		}
	}
}
