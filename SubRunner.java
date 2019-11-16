package matrix;

public class SubRunner {
	
	
	public static void main(String[] args) {
		SubMat mt=new SubMat();
	System.out.println("read the first matrix");
	int a[][]=mt.readMat();
	System.out.println("read the second matrix");
	int b[][]=mt.readMat();
	System.out.println("----------");
	System.out.println("display the first matrix");
	mt.displayMat(a);
	System.out.println("read the first matrix");
	mt.displayMat(b);
	System.out.println("------------");
	int s[][]=mt.SubMat(a, b);
	if(s!=null)
	{
		System.out.println("addition of first  and second");
		mt.displayMat(s);
	}
	
	
}


}
