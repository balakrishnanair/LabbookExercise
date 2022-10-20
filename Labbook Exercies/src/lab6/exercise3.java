package lab6;
import java.util.*;
public class exercise3 {


	public static void main(String[] args)
	{
		int[] arr= {1,5,8,7,9,16,25,2,2,2,3,4,4,5,78,6677,88};
		exercise3 lab= new exercise3();
		Map mp= lab.getSquares(arr);
		System.out.println("The Map for squares ");
		System.out.println(mp);
		
	}
	public Map getSquares(int[] arr)
	{
		Map<Integer,Integer> mp1= new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			mp1.put(arr[i], (arr[i]*arr[i]));
		}
		return mp1;
		
	}
}
