package matrix;

import java.util.Scanner;

public class TransposeMat {
	int [][] readMat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and col");
		int r=sc.nextInt();
		int c=sc.nextInt(); 
		int mat[][]=new int[r][c];
		for(int i=0;i<mat.length;i++)//row
		{
			System.out.println("enter"+(i+1)+"row"+"element");
			for(int j=0;j<mat[i].length;j++)//element of row
			{
				mat[i][j]=sc.nextInt();//row*col
			}
		}
		return mat;
	}
	void displayMat(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}	
	}
	void transpose(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=i+1;j<mat.length;j++)
			{
			int t=mat[i][j];	
					mat[i][j]=mat[j][i];
			mat[j][i]=t;
			}
		}
	}
	public static void main(String[] args) {
		TransposeMat tm=new TransposeMat();
		System.out.println("read first matrix");
		int a[][]=tm.readMat();
		System.out.println("before transepose");
		tm.displayMat(a);
		tm.transpose(a);
		System.out.println("after transe");
		tm.displayMat(a);
		
	}
	

}
