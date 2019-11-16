	import java.io.*;
	import java.lang.*;
import java.util.Scanner;
public class Neafshs {

	   
	        public static void main(String args[])
	        {
	        Scanner sc=new Scanner(System.in);
	          System.out.println("Enter the char:");
	          String str = sc.next();
	          for ( int i = 0; i < str.length(); ++i ){
	            char c = str.charAt(i);
	            int j = (int) c;// your work is done here
	            System.out.println("ASCII OF "+c +" = " + j + ".");
	            }
	        }
	      }
