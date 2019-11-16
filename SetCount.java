import java.util.Scanner;

public class SetCount {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no");
	int no=sc.nextInt();
	int c= getSetCount(no);
	System.out.println("in number"+no+" "+c+"are setted");
}
static int getSetCount(int n)
{
	int count =0;
	while(n!=0){
		
	if(n%2==1)
		count ++;
	n=n/2;
	
}
	return count;
}
}