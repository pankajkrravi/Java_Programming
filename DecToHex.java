import java.util.Scanner;

public class DecToHex {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the no");
			int no= sc.nextInt();
			String hex=getDecToHex(no);
			System.out.println(no+"decimal to binary"+" "+hex);
			
		}
		static String getDecToHex(int dec)

		{
			String hex="";
			while(dec!=0)
			{
				int r=dec%16;
				if(r<10)
				{
				hex= r+hex;
				}
				else
				{
					switch (r) {
					case 10: hex='A'+hex;
					break;
					
					case 11: hex='B'+hex;
					break;
					case 12: hex='C'+hex;
					break;
					case 13: hex='D'+hex;
					break;
					case 14: hex='E'+hex;
					break;
					case 15: hex='F'+hex;
					break;
					}
					}
				
				dec=dec/16;
			}
			return hex;
		}
		}


