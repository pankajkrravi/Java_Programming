import java.util.Scanner;

public class Selectionsort {
	 public static void main(String args[])
	   {
	       
	       int arr[] = new int[50];
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Array Size : ");
	      int size = scan.nextInt();
		   
	       System.out.print("Enter Array Elements : ");
	       for(int i=0; i<size; i++)
	       {
	           arr[i] = scan.nextInt();
	       }
		   
	       System.out.print("Sorting Array using Selection Sort Technique..\n");
	       for(int i=0; i<size; i++)
	       {
	           for(int j=i+1; j<size; j++)
	           {
	               if(arr[i] > arr[j])
	               {
	                 int  temp = arr[i];
	                   arr[i] = arr[j];
	                   arr[j] = temp;
	               }
	           }
	       }
		   
	       System.out.print("Now the Array after Sorting is :\n");
	       for(int i=0; i<size; i++)
	       {
	           System.out.print(arr[i]+ "  ");
	       }
	   }


}
