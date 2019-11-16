package matrix;

public class BiggestRunner {
	public static void main(String[] args) {
		BiggestEleINMat mt=new BiggestEleINMat();
	System.out.println("read the first matrix");
	int a[][]=mt.readMat();
	
	System.out.println("display the first matrix");
	mt.displayMat(a);
	System.out.println("display the big element");
	  mt.getBig(a);
	
	
	
}



}
