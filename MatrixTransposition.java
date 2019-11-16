package com.java.programming;
public class MatrixTransposition 
{
	public static void main(String[] args) {
	MatricsAddition ma= new MatricsAddition();
	int ar[][]=ma.readMat();
	System.out.println("Your matrics is before transposition: ");
	ma.displayMat(ar);
	System.out.println("your matrics after transposition");
	Transposematrics(ar);
	ma.displayMat(ar);
	}

	private static void Transposematrics(int[][] ar) {
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar[i].length;j++)
			{
				int t=ar[i][j];
				ar[i][j]=ar[j][i];
				ar[j][i]=t;
			}
		}
		
	}
}
