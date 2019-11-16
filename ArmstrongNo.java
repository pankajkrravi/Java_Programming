
import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String[] args)  {  
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		boolean am=isArmstrongs(no);
		if(am)
		{
			System.out.println(no +  "armstrong number"); 
		}
		else 
		{
			System.out.println(no + " Not armstrong number");   
		}
	}
	static boolean isArmstrongs(int x)
	{

		int sum=0;
		int temp=x;
		int c=getCount(x);
		while (x!= 0) {
	        int r=x% 10;
	        sum= sum+pow(r,c);
	        x=x/10;
		}
		

		return sum==temp;  

	}  
	static int pow(int nb,int rem)
	{
		int pw=1;
		while(rem>0)
		{
			pw=pw*nb;
			rem--;
		}
		return pw;
        	}
	static int getCount(int x)
	{
		int count=0;
		while(x!=0)
		{	
			count++;
			x=x/10;
			
	}
		return count;
	}
}



