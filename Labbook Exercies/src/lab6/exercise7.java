package lab6;
import java.util.*;
public class exercise7 {


	public static void main(String[] args)
	{
		
		int arr[]= {23,98,6,55,76,19,9,81,91,94,10,11};
		exercise7 lb7= new exercise7();
		int arr2[]=lb7.getSorted(arr);
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}
	public int[] getSorted(int[] arr)
	{
		List<Integer> lst= new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			StringBuilder str= new StringBuilder();
			str.append(arr[i]);
			str.reverse();
			String str1=str.toString();
			System.out.println(str1);
			int n=Integer.valueOf(str1);
			lst.add(n);
		}
		System.out.println(lst);
		Collections.sort(lst);
		int arr1[] =new int[arr.length];
		int count=0;
		Iterator itr =lst.iterator();
		while(itr.hasNext())
		{
			arr1[count]=(int) itr.next();
			count++;
		}
		return arr1;
	}
}
