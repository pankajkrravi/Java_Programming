package com.java.programming;

public class RowWiseBiggest {
	public static void main(String[] args) {
		MatricsAddition ma= new MatricsAddition();
		int ar[][]=ma.readMat();
		rowwisebiggest(ar);
	}

	private static void rowwisebiggest(int[][] ar) {
		for(int i=0;i<ar.length;i++)
		{
			int big=ar[i][0];
			for(int j=0;j<ar[i].length;j++)
			{
				if(big<ar[i][j])
					big=ar[i][j];
			}
			System.out.println(i+1+"row Biggest element: "+big);
		}
	}
}