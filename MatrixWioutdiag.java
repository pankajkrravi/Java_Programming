import java.util.Scanner;

public class MatrixWioutdiag
{
	int [][]readMat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of  row and no of colom");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int  mat[][]=new int[r][c];
		for(int i=0;i<mat.length;i++)
		{
			System.out.println("enter "+(i+1)+"row"+mat[i]+" element");
			for(int j=0;j<mat.length;j++)
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
			for(int j=0;j<mat.length;j++)
			{
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println("");
		}
	}
	void digMat(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				if(i==j||i+j==mat.length+1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(mat[i][j]+"");
				}
				System.out.println();
			}
		}
	}


	public static void main(String[] args) {
		MatrixWioutdiag mw=new MatrixWioutdiag();
		System.out.println("read the matrix");
		int a[][]=mw.readMat();
		mw.displayMat(a);
		mw.digMat(a);
		mw.displayMat(a);

	}
}

