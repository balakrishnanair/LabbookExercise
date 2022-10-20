package lab1;
/*
 * Exercise 6: Create a class with a method to find the difference 
 * between the sum of the squares and the square of the sum of the first n natural numbers.
 */
import java.util.Scanner;

public class exercise6 {
	
	public static int calculateDifference(int n) {
		int diff = (n*(n+1)*(2*n+1)/6) - ((int)Math.pow(n*(n+1)/2, 2));
		return diff;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int number = sc.nextInt();
		System.out.println(calculateDifference(number));
	}

}
