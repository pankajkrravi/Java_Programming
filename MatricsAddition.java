package com.java.programming;
import java.util.Scanner;
public class MatricsAddition {

	int[][] readMat()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows and number of columns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]= new int[r][c];

		for(int i=0;i<mat.length;i++)
		{
			System.out.println("enter"+(i+1)+"row"+mat[i].length+"  elements");
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	void displayMat(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			for (int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	int [][]addmat(int x[][],int [][]y)
	{
		if(x.length!=y.length||x[0].length!=y[0].length)
		{
			System.out.println("Order must be same");
			return null;
		}
		int sum[][]=new int[x.length][x[0].length];
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				sum[i][j]=x[i][j]+y[i][j];
			}
		}
		return sum;
	}
public static void main(String[] args) {
	MatricsAddition mt = new MatricsAddition();
	System.out.println("Read first Matrix");
	int a[][]=mt.readMat();
	System.out.println("Read Second Matrix");
	int b[][]=mt.readMat();
	System.out.println("-----------------");
	System.out.println("First Matrix Elements");
	mt.displayMat(a);
	System.out.println("------------------");
	System.out.println("Second Matrix Elements");
	mt.displayMat(b);
	System.out.println("--------------------");
	int s[][]=mt.addmat(a, b);
	if(s!=null)
	{
		System.out.println("Addition of First and Second Matrix");
		mt.displayMat(s);
	}
}
}
