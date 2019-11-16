
public class SumogDiagonal {
	static int sumofprimarydiagonal(int matrix[][])
	{
		int sum=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(i==j)
				{
					sum=sum+matrix[i][j];
				}
			}
		}
		return sum;
	}
	static int sumofsecondarydiagonal(int matrix[][])
	{
		int sum=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(i+j==2)
				{
					sum=sum+matrix[i][j];
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int matrix[][]={{1,2,5},{1,7,3},{1,2,3}};
		System.out.println(sumofprimarydiagonal(matrix));
		System.out.println(sumofsecondarydiagonal(matrix));
		
	}
	

}
