
public class Bubblesort {
	
		 static void bubble(int[] a)
		{
			int n=a.length;
			for (int i =0;i<n;i++ )
			{
				for (int j =0;j<n;j++ )
				{
				if(a[i]	>   a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				}
				}
				
			}
				
		}
		
		public static void main(String[] args) {
			int[] a={5,6,8,9,3};
			bubble( a);
			for(int x: a)
			{
				System.out.println(x);  
			}
			
		}
		
	

}
