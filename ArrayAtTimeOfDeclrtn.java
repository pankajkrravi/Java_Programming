
public class ArrayAtTimeOfDeclrtn {//at the of declaration //
	public static void main(String[] args) {
		int ar[]={25,46,78,89,32};
		System.out.println("no of element" + ar.length);//value 5
		for (int i = 0; i < ar.length; i++) {//0 to n index
			System.out.println(i +" ---->"+ar[i]);
		}
		for (int i = ar.length-1; i >=0 ; i--) {//n to 0 index
			System.out.println(i +"---->" + ar[i]);
		}
	}

}
