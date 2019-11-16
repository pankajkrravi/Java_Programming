
public class OperationMain {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("enter first array element");
		int a[]=ao.readArray();
		System.out.println("enter 2nd array element");
		int b[]=ao.readArray();
		int rs[]=ao.mergeArray(a, b);
		System.out.println("first element");
		ao.display(a);
		System.out.println("2nd element");
		ao.display(b);
		System.out.println("merged array");
		ao.display(rs);
	}

}
