import java.util.Scanner;

public class Xm {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int no=sc.nextInt();
	isPrime1(no);

	}
	
static void isPrime1(int n)
{
	for(int i=1;i<=n;i++){
int c=1,j=0;

while(i<=n/2)
{
if(n%i==0)
		c++;
	i++;

if(c==2)

System.out.println(j);
j=j++;
}	
}
}
}

