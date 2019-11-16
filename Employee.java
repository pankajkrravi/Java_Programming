import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		int ins=200;
		int lbrDed=200;
		System.out.println("Enter the name of employee");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("Enter the employee id");
		int eId=sc.nextInt();
		System.out.println("Enter the basic salary");
		int bSal=sc.nextInt();
		System.out.println("Enter the special allowance");
		int sa=sc.nextInt();
		System.out.println("<==============================EMPLOYEE DETAILS==============================>");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Name              : "+name);
		System.out.println("Employee ID       : "+eId);
		System.out.println("\n---------------------------------------------------------------------------");
		System.out.println("Basic Sal         : "+bSal+                "\t PF               : "+getPF(bSal));
		System.out.println("HRA               : "+getHra(bSal)+        "\t Professional Tax : "+getPTax(bSal));
		System.out.println("Conveyance        : "+getConveyance(bSal)+ "\t TDS              : "+getTds(bSal));
		System.out.println("Special allowance : "+sa+                  "\t Insurance        : "+ins);
		System.out.println("\t                         Labour deduction : "+lbrDed);
		System.out.println("Gross Salary      : "+getGrossSal(bSal,sa)+"\t Total deduction  : "+getDeduction(bSal,ins,lbrDed));
		System.out.println("\n---------------------------------------------------------------------------");
		System.out.println("Net Pay           : "+getNetPay(bSal,sa,ins,lbrDed));
	}

	private static double getNetPay(int bSal,int sa,int ins,int lbrDed) {
		double grossPay=getGrossSal(bSal, sa);
		double totDeduction=getDeduction(bSal, ins, lbrDed);
		double netPay=grossPay-totDeduction;
		return netPay;
	}

	private static double getDeduction(int bSal,int ins, int lbrDed) {
		double pf=getPF(bSal);
		double pTax=getPTax(bSal);
		double tds=getTds(bSal);
		double totDeduc=pf+pTax+tds+ins+lbrDed;
		return totDeduc;
	}

	private static double getTds(int bSal) {
		double tds;
		tds=0.10*bSal;
		return tds;
	}

	private static double getPTax(int bSal) {
		double pTax;
		pTax=0.05*bSal;
		return pTax;
	}

	private static double getPF(int bSal) {
		double pf;
		pf=0.12*bSal;
		return pf;
	}

	private static double getGrossSal(int bSal, int sa) {
		double hra=getHra(bSal);
		double conv=getConveyance(bSal);
		double grossSal=bSal+hra+conv+sa;
		return grossSal;
	}

	private static double getConveyance(int bSal) {
		double conv;
		conv=0.08*bSal;
		return conv;
	}

	private static double getHra(int bSal) {
		double hra;
		hra=0.15*bSal;
		return hra;
	}
}
