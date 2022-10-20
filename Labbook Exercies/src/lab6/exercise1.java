package lab6;

/*
 * Exercise 1: Create a method which accepts a 
 * hash map and return the values of the map in sorted order as a List.
 */
import java.util.*;
import java.util.Map.Entry;
public class exercise1 {


	public static void main(String[]args)
	{
		HashMap<String,Integer> hmap= new HashMap();
		hmap.put("ABC", 78);
		hmap.put("DEF", 87);
		hmap.put("DEFG",64);
		hmap.put("GHI", 51);
		hmap.put("JKL", 86);
		exercise1 l1= new exercise1();
		List lst1=l1.getvalues(hmap);
		System.out.println(lst1);
	}
	public List getvalues(HashMap m)
	{
		
		List<Integer> lst=new ArrayList<>();
		Set<Entry<String,Integer>> setObj= m.entrySet();
		for(Entry<String, Integer> el:setObj)
		{
			lst.add(el.getValue());
		}
		Collections.sort(lst);
		return(lst);
		
	}
}
