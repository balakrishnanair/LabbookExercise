package lab6;
import java.util.*;
public class exercise2 {



	public static void main(String[] args)
	{
		char[] ch= {'a','e','i','e','o','i','a','o','a','a','u'};
		exercise2 l2=new exercise2();
		Map mp =l2.countChars(ch);
		System.out.println(mp);
	}
	public Map countChars(char[] arr)
	{
		Map<Character,Integer> mp= new TreeMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i]))
			{
				
			}
			else
			{
				int count=0;
				for(int j=i;j<arr.length;j++)
				{
					if(arr[j]==arr[i])
					{
						count++;
					}
				}
				mp.put(arr[i], count);
			}
		}
		return mp;
	}
}