
public class prog4 {
	public static void main(String[] args) {
		int ar[]={23,45,34,42,32,-1,-2,-6};
		System.out.println("no. of elements "+ar.length);
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			System.out.println("negative numbers is "+ar[i]);
		}
	}

}
