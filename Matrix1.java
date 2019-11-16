import java.util.Scanner;

public class Matrix1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of row and no of col");
		int r=sc.nextInt();
		int c=sc.nextInt();
		//int mat[][]=new int[r][c];//
		//int [][] mat=new int[r][c];//
		int[]mat[]=new int[r][c];
		for(int i=0;i<mat.length;i++)//input
		{
			System.out.println("enter"+(i+1)+"row elements");
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("entered matrix elemts");
		for(int i=0;i<mat.length;i++)//display
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}


	}

}


