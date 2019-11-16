package matrix;

public class Date { 
	int dd;
	int mm;
	int yy;
	public Date(int dd, int mm, int yy) {
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		
	}
	@Override
	public String toString() {
		return  dd+"/"+mm+"/"+yy;
	}
	public int totalDays()
	{
	int days=0;
	int y=yy-1;
	}
	public static void main(String[] args) {
		Date d1=new Date(15,8,1947);
		Date d2=new Date(2,3,2018);
	}
	
	

}
