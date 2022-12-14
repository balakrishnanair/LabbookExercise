package lab6;
import java.util.*;
/*
 * Exercise 7: Create a method which accepts an integer array, reverse the 
 * numbers in the array and returns the resulting array in sorted order
 */
public class exercise7 {


	public static int[] getSorted(int[] a) {
		
		for (int i=0;i<a.length;i++) {
			int s = 0;
			while (a[i] > 0) {
				int d = a[i]%10;
				a[i] = a[i]/10;
				s = s*10 + d;
			}
			a[i] = s;
		}
		Arrays.sort(a);
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int[] a = new int[n];
		
		System.out.println("Enter the elements of the array: ");
		
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(getSorted(a)));
		
		sc.close();
	}

}