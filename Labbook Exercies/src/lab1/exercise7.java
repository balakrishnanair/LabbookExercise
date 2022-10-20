package lab1;
/*
 * Exercise 7: Create a method to check if a number is an increasing number
 */
import java.util.Scanner;

public class exercise7 {
	
	public static boolean checkNumber(int n) {
		boolean a;
		int rem=10, temp=10;
		
		do {
			temp = rem;
			rem = n%10;
			n /= 10;
		}
		while(n>0 && temp >= rem);
		
		a = (n==0);
		return a; 
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is increasing");
		int number = sc.nextInt();
		System.out.println(checkNumber(number));

	}

}
