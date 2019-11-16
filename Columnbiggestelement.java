package com.java.programming;

public class Columnbiggestelement {
	public static void main(String[] args) {
		MatricsAddition ma= new MatricsAddition();
		int ar[][]=ma.readMat();
		columnwisebiggest(ar);
	}

	private static void columnwisebiggest(int[][] ar) {
		for(int i=0;i<ar.length;i++)		
		{
			int big=ar[0][i];
			for(int j=0;j<ar[i].length;j++)
			{
				if(big<ar[j][i])
					big=ar[j][i];
			}
		System.out.println(i+1+"Biggest element in column"+big);
		}
	}
}
