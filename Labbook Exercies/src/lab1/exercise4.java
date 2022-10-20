package lab1;
/*
 * Exercise 4: Write a Java program that prompts the user for an integer 
 * and then prints out all the prime numbers up to that Integer?
 */
import java.util.Scanner;

public class exercise4 {
	public static void prime(int number) {

		for(int i=2; i<number; i++) {
			int count=0;
			for(int j=2; j<i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
				
			if(count == 0) {
				System.out.print(i + " ");
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print all prime numbers upto it");
		int integer = sc.nextInt();
		prime(integer);
	}

}
