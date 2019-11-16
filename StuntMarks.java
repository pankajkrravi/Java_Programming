
public class StuntMarks {
 static Character getGrade(int m1,int m2, int m3,int m4)
{
	char grade;
	if(m1<40||m2<40||m3<40||m4<40)
		grade='f';
	else
	{
		double per=(m1+m2+m3+m4)/4.0;
		 if(per>=80)
			grade='A';
		else if(per>=60)
			grade='B';
		else if(per>=50)
			grade='C';
		else
			grade='D';
		
	}
	return grade;
}
 public static void main(String[] args) {
	int m1=50,m2=80,m3=65,m4=85;
	char rs=getGrade(m1, m2, m3, m4);
	System.out.println("enter the grade"+rs);
	int a=85,b=60,c=65,d=80;
	char ch=getGrade(a, b, c, d);
	System.out.println("enter the grade"+rs);
	
}
}
