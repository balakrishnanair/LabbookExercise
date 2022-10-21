package lab3;
/*
 * Exercise 1: Write a Java program that reads a line of integers 
 * and then displays each integer and the sum of all integers
 */
import java.util.StringTokenizer;
public class exercise1 {

		public static void main(String[] args)
		{
			String nums= "10 20 30 40 50 60 70 80";
		
		StringTokenizer st = new StringTokenizer(nums);
		int sum1=0;
		
		while (st.hasMoreTokens())
		{
			String token1= st.nextToken();
			System.out.println(token1);
			sum1= sum1+ Integer.parseInt(token1);
		}
		System.out.println("Sum of the Integers in the string ="+sum1);
	}
	}
	

