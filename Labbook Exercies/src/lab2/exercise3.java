package lab2;
/*
 * Exercise 3: Create a method which accepts an integer array, 
 * reverse the numbers in the array and returns the resulting array in sorted order

 */
import java.util.*;
public class exercise3 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = scan.nextInt();
		int x[] = new int[n];
		
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++) {
			x[i]=scan.nextInt();
		}
		
		
       int sort[]=getSorted(x);
		
		System.out.println("Sorted elements: \n");
		for(int i=0;i<n;i++)
		System.out.println(sort[i]);

	}
	
	public static int[] getSorted(int x[]) {
		String y[]=new String[x.length];
		for(int i=0;i<x.length;i++) {
			y[i]=String.valueOf(x[i]);
		}
		
		for(int i=0;i<x.length;i++) {
		StringBuffer s = new StringBuffer(y[i]);
		x[i]=Integer.parseInt(s.reverse().toString());
		}
		
	
		Arrays.sort(x);
		return x ;
		
	}
}
