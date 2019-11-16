import java.util.Scanner;

public class StudRptCrd {
	public static void main(String[] args) {

		String name;
		int roll_no;
		String sub;
		int max,min,obtain,total;

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the name");
		String nm=sc.next();
		System.out.println("enter the roll number");
		int r=sc.nextInt();
		System.out.println("enter tthe four sub marks");
		int py=sc.nextInt();
		int cm=sc.nextInt();
		int bo=sc.nextInt();
		int mt=sc.nextInt();
         System.out.println("====REPORT===");
		System.out.println(".....................");	
		System.out.println("name :"+nm);
		System.out.println("roll no :"+r);
		System.out.println("\n .....................");
		System.out.println("subject   max    min    obtain ");
		System.out.println("\n.................");
		System.out.println("physics    100      40     85");
		System.out.println("chemistry  100      40     65");
		System.out.println("math       100      40     75 ");
		System.out.println("boilogy    100      40     89");
		System.out.println("total       400      160   "+getTotal(py,cm,mt,bo));
		System.out.println(".........................");
		System.out.println("percentage" + getTotal(py,cm,mt,bo)/4.0);
		System.out.println("..............................");
		System.out.println("result"+getResult(py,cm,mt,bo));
	}
	private static String getResult(int py,int cm,int mt,int bo)
	{
		if(py<40||mt<40||cm<40||bo<40)
			return	"fail";
		else
		{
			double per= getTotal(py,cm,mt,bo)/4.0;
			if(per>=85)
				return"Distinction";
			else if(per>=60)
				return"first";
			else if(per>=50)
				return"second clss";
			else 
				return"psss";
		}

	}
	private static int  getTotal(int py,int cm,int mt,int bo)
	{
		return py+mt+cm+bo;
	}
}
