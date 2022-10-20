package lab1;
/*
 * Exercise 5: Create a class with a method 
 * which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
 */
import java.util.Scanner;

public class exercise5 {
	
	public static int calculateSum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i%3 ==0 || i%5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n to calculate sum of numbers first n no.s divisible by 3 and 5");
		int number = sc.nextInt();
		System.out.println(calculateSum(number));

	}

}
