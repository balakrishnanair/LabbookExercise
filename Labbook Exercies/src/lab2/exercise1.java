package lab2;

//Exercise 1: Create a method which accepts an array of integer elements 
//and return the second smallest element in the array
import java.util.Arrays;
import java.util.Scanner;


public class exercise1 {

	public static void main(String args[]) {
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter array size:");
		int n =scan.nextInt();
		
		int x[]= new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			
			x[i]=scan.nextInt();
			
		}
		int s=getSecondSmallest(x);
		System.out.println("Second smallest element: "+s);
		
	}
	
	public static int getSecondSmallest(int x[]) {
	Arrays.sort(x);
		
		return x[1];
		
	}
}



/*for(int i=0;i<n;i++) {
for(int j=i+1;j<=n-1;j++) {
	if(x[j]<x[i]) {
		int swap=x[j];
		x[j]=x[i];
		x[i]=swap;
	}
}
}*/
/*for(int i=0;i<x.length;i++)
System.out.println(x[i]);
*///Arrays.toString prints array
