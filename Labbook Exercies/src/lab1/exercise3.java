package lab1;
/*
 * The Fibonacci sequence is defined by the following rule. 
 * The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. 
 * Write a Java program that uses both recursive and non-recursive 
 * functions to print the nth value of the Fibonacci sequence?
 */
import java.util.Scanner;

public class exercise3 {
	
	static int term1 = 1, term2 = 1, nth_term, temp1=term1, temp2=term2;
	
	public static int fibanocciNonRecursive(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		while(n>2) {
			nth_term = term1 + term2;
			term1 = term2;
			term2 = nth_term;
			n--;
		}
		return nth_term;
	}
	
	public static int fibanocciRecursive(int n) {
		if(n>0) {
			nth_term = temp1 + temp2;
			temp1 = temp2;
			temp2 = nth_term;
			fibanocciRecursive(n-1);
		}
		return nth_term;
	}
	
	
	public static void main(String[] args) {
		int num;
		System.out.println("Enter number of terms");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("The nth Term using non-recursive method is");
		System.out.println(fibanocciNonRecursive(num));
		System.out.println("The nth Term using recursive method is");
		System.out.println(fibanocciRecursive(num-2));
	}
}



