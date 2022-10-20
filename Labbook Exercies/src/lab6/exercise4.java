package lab6;

import java.util.*;
import java.util.Map.Entry;

public class exercise4 {


	public static void main(String[] args)
	{
		exercise4 l4= new exercise4();
		HashMap<String, Integer> mp2=new HashMap<>();
		mp2.put("Ram", 100);
		mp2.put("Shyam", 67);
		mp2.put("Satya", 80);
		mp2.put("Rama", 70);
		mp2.put("Ghanshyam", 90);
		Map m4=l4.getStudents(mp2);
		System.out.println("Students along with their eligible medals are"+m4);
	}
	public HashMap getStudents(HashMap mp)
	{
		HashMap<String,String> mp1=new HashMap<>();
		
		Set<Entry<String, Integer>> set1= mp.entrySet();
		for(Entry<String,Integer> el:set1)
		{
			String key=el.getKey();
			int value =el.getValue();
			
			if(value>=90)
			{
				mp1.put(key, "Gold");
			}
			else if(value>=80)
			{
				mp1.put(key, "Silver");
			}
			else if(value>=70)
			{
				mp1.put(key, "Bronze");
			}
			else
			{
				mp1.put(key, "No Medal");
			}
		}
		return mp1;
	}
}
