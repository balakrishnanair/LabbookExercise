
package lab1;
/*
 * Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number
 */
import java.util.Scanner;

public class Exercise1 {
	public static int sumOfCubes(int digits, int num) {
		int sum=0, rem;
		while(digits>0) {
			rem = num%10;
			sum += rem*rem*rem;
			num /= 10;
			digits--;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int digits,num;
		System.out.println("Enter number of digits");
		Scanner sc=new Scanner(System.in);
		digits=sc.nextInt();
		System.out.println("Enter number");
		num=sc.nextInt();
		System.out.println(sumOfCubes(digits,num));
	}

}
