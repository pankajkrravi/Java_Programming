package matrix;

import java.util.Scanner;

public class RowrevMat {
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
	void rowRev(int ar[][])
	{
		for(int i=0;i<ar.length;i++)
		{
		for(int j=0;j<ar[i].length/2;j++)
		{
		int t=ar[i][j];
		ar[i][j]=ar[i][ar[i].length-1-j];
		ar[i][ar[i].length-1-j]=t;
		
		}
		}
	}
	public static void main(String[] args) {
		RowrevMat rvm=new RowrevMat();
		System.out.println("read first matrix");
		int a[][]=rvm.readMat();
		System.out.println("before rev");
		rvm.displayMat(a);
		rvm.rowRev(a);
		System.out.println("after rev");
		rvm.displayMat(a);
		
	}

}
