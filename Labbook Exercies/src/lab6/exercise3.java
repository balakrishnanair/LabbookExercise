package lab6;
/*
 * Exercise 3: Create a method which accepts an 
 * array of numbers and returns the numbers and their squares in hash map
 */
import java.util.*;
public class exercise3 {
public static Map<Integer, Integer> getSquares(int[] a) {
		
		HashMap<Integer, Integer> squared = new HashMap<Integer, Integer>();
		
		for (Integer i: a) {
			squared.put(i, i*i);
		}
		
		return squared;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter the elements of the array...");
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		getSquares(a).entrySet().forEach(entry -> {
			System.out.println(entry.getKey()+" "+entry.getValue());
		});
		
		sc.close();
	}
}
