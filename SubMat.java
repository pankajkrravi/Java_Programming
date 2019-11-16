package matrix;

import java.util.Scanner;

public class SubMat {
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
	int[][] SubMat(int x[][],int y[][])
	{
		if(x.length!=y.length||x[0].length!=y[0].length)
		{
			System.out.println("order must be same");
			return null;
		}
		int sum[][]=new int[x.length][x[0].length];
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				sum[i][j]=x[i][j]-y[i][j];
			}
		}
		return sum;
	}

}
