package matrix;

import java.util.Scanner;

public class ReverseDiag {
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
	void reverseDiag(int a[][])
	{
	for(int i=0;i<a.length/2;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(i==j)
			{
				int t=a[i][j];
				a[i][j]=a[a.length-1-i][a.length-1-j];
				a[a.length-1-i][a.length-1-j]=t;
				
			}
			if(i+j==a.length-1)
			{
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
				
			}
		}
	}
	}
	public static void main(String[] args) {
		ReverseDiag  rd=new ReverseDiag ();
		System.out.println("read first matrix");
		int a[][]=rd.readMat();
		
		rd.displayMat(a);
		rd.reverseDiag(a);
		
		rd.displayMat(a);
		
		
	}

}
