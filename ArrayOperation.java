import java.util.Scanner;

public class ArrayOperation {
int [] readArray()
{
	Scanner sc= new Scanner(System.in);
			System.out.println("enter how many element ");
			int n=sc.nextInt();
			int ar[]=new int[n];
			System.out.println("enter"+n+"value");
			for (int i = 0; i < n; i++) {
				ar[i]=sc.nextInt();
	
			}
			return ar;
}
void disArray(int[]a)
{
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]+" ");
		
	}
	System.out.println();
}
int[]margeArray(int x[],int y[])
{
	int z[]=new int[x.length+y.length];
	for (int i = 0; i < x.length; i++) {
		z[i]=x[i];
		
		
	}
	for (int i = 0; i < y.length; i++) {
		z[x.length+i]=y[i];
		
		
	}
	return z;
}
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	System.out.println("enter the first element");
	int a[]=ao.readArray();
	System.out.println("enter the second array");
	int b[]=ao.readArray();
	int rs[]=ao.margeArray(a, b);
	System.out.println("first array");
	ao.disArray(a);
	System.out.println("second");
	ao.disArray(b);
	System.out.println("final array");
	ao.disArray(rs);
	
}
public void reverse(int[] a) {
	// TODO Auto-generated method stub
	
}
}
