package matrix;

import java.util.Scanner;

public class RowWisebiggest {
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
	public void rowwisebiggest(int [][] a)
	{
		for(int i=0;i<a.length;i++)
		{
		int	big=a[i][0];
		for(int j=0;j<a[i].length;j++)
		{
			if(big<a[i][j])
				big=a[i][j];
		}
		System.out.println(i+1+"row biggest element:"+big);
		}
	}
	public static void main(String[] args) {
		RowWisebiggest rwb=new RowWisebiggest();
		System.out.println("read first matrix");
		int a[][]=rwb.readMat();
		
		rwb.displayMat(a);
		rwb.rowwisebiggest(a);
		
		rwb.displayMat(a);
		
	}

}
