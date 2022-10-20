package lab2;
/*
 * Exercise 4: Create a method which accepts an integer array and removes all the duplicates in the array.
 *  Return the resulting array in descending order
 */

import java.util.Arrays;
import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp1[]=modifyArray(arr);
		System.out.println(Arrays.toString(temp1));
	}
	
	private static int[] modifyArray(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int temp[]=new int[arr.length];
		int j=0,check=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=check) {
				temp[j++]=check;
				check=arr[i];
			}
		}
		System.out.println(Arrays.toString(temp));
		return temp;
	}

}

