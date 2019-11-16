package matrix;

import java.util.Scanner;

public class BigInupperMat {
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
	public void bigIneleinupper(int [][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i;j<a.length;j++)
			{
			int max=a[0][0];
			if(i<j)
			{
			if(a[i][j]>max)
			{
				max=a[i][j];
			}
			System.out.println("in upper matrix"+max);
			}
			}
		}
	}
	public static void main(String[] args) {
		BigInupperMat bem=new BigInupperMat();
		System.out.println("read first matrix");
		int a[][]=bem.readMat();
		
		bem.displayMat(a);
		bem.bigIneleinupper(a);
		
		
		
	}

}
