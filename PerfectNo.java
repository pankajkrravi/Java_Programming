import java.util.Scanner;

public class PerfectNo {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		boolean rs=isPerfect(no);
				if(rs)
					System.out.println(no +" " +"is prfect" );
				else
					System.out.println(no +" "+ "is not prfect");

	}

static  boolean isPerfect(int n)
{ int sum = 0;
for (int i=1; i<n; i++)
{
    if (n%i == 0)
    {
        sum = sum + i;
    }
}
if (sum == n)
{
    return true;
}
else
{
    return false;
}
}
}