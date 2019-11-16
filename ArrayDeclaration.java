
public class ArrayDeclaration {
	public static void main(String[] args) {
		int ar[]={23,45,34,42,32};
		System.out.println("no. of elements "+ar.length);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(i+"--"+ar[i]);
		}
		for(int i=ar.length-1;i>0;i--)
		{
			System.out.println(i+"---"+ar[i]);
		}
	}
	

}
