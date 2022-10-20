package lab6;
import java.util.Map;
import java.util.*;
import java.util.Map.Entry;
public class exercise6 {

	public static void main(String[] args)
	{
		Map<String,Integer> mp= new HashMap<>();
		mp.put("Ram",17);
		mp.put("Ghanshyam",21);
		mp.put("Rohit",18);
		mp.put("Shyam",77);
		mp.put("Ghansh",17);
		mp.put("Ansh",9);
		mp.put("Ham",54);
		mp.put("Sam",29);
		mp.put("Hansh",77);
		exercise6 lb6= new exercise6();
		List l=lb6.votersList(mp);
		System.out.println(l);
	}
	public List votersList(Map mp)
	{
		Set<Entry<String, Integer>> st =mp.entrySet();
		List<String> lst=new ArrayList<>();
		for(Entry<String,Integer> en: st)
		{
			String id = en.getKey();
			int age= en.getValue();
			if(age>18)
			{
				lst.add(id);
			}
		}
		return lst;
	}
}