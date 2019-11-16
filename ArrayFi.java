import java.util.Scanner;

public class ArrayFi {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the array element");
	int no= sc.nextInt();
    int	ar[]=new int[no];
    System.out.println("enter the value");
    for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();	
		}
    int e=0,o=0;
    for (int i = 0; i < ar.length; i++) {
    	if(ar[i]%2==0)
    		e++;
    	else
    		o++;
		
	}
    System.out.println("even"+e);
    System.out.println("odd"+o);
	
}
}
