package lab6;
import java.util.*;
public class exercise5 {


	public static void main(String[] args)
	{
		exercise5 lb= new exercise5();
		int ar[]= {2,4,7,8,55,1,3,0,5,7};
		int n= lb.getSecondSmallest(ar);
		System.out.println(n);
	}
	public int getSecondSmallest(int[] arr)
	{
		List<Integer> lst1= new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			lst1.add(arr[i]);
		}
		Collections.sort(lst1);
		System.out.println(lst1);
		return (lst1.get(1));
	}
}

