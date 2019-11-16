package matrix;

import java.util.Scanner;

public class ColwiseRev {
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
	public void ColwiseRev(int [][] a)
	{
		for(int i=0;i<a.length;i++)
		{
		int	big=a[0][i];
		for(int j=0;j<a[i].length;j++)
		{
			if(big<a[j][i])
				big=a[j][i];
		}
		System.out.println(i+1+"col biggest element:"+big);
		}
	}
	public static void main(String[] args) {
		ColwiseRev cwr=new ColwiseRev();
		System.out.println("read first matrix");
		int a[][]=cwr.readMat();
		
		cwr.displayMat(a);
		cwr.ColwiseRev(a);
		
		cwr.displayMat(a);
		
		
	}
}
