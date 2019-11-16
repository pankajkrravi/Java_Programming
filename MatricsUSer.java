package com.java.programming;

import java.util.Scanner;
public class MatricsUSer {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows and number of columns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		// int mat[][]= new int [r][c];
		//int [][]mat= new int[r][c];
		int []mat[]= new int [r][c];
		for(int i=0;i<mat.length;i++)
		{
			System.out.println("Enter "+(i+1)+" row elements: ");
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("entered matrix elements");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
