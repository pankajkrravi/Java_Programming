package matrix;

import java.util.Scanner;

public class Spiral {
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
	void spiral(int mat[][])
	{
		int j,k,n;
		
		for(int i=0; j=n-1;i++,j--)
			
		
		{
			for(int k=i; k<j;k++)
			System.out.println(mat[i][k]+"");
			for(int k=i; k<j;k++)
				System.out.println(mat[k][j]+"");
			for(int k=j; k>i;k--)
				System.out.println(mat[j][k]+"");
			for(int k=j;k>i; k--)
				System.out.println(mat[k][i]+"");
			else
				if(n%2==1)
					System.out.println(mat[n/2][n/2]+"");
		}
	}
	public static void main(String[] args) {
		Spiral tm=new Spiral();
		System.out.println("read first matrix");
		int a[][]=tm.readMat();
		System.out.println("before transepose");
		tm.displayMat(mat);
		tm.spiral(mat);
		System.out.println("spiral");
		tm.displayMat(mat);
		
		
	}
	

}
