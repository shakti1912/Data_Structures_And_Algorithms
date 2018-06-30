package Hashing.General_Problems;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

/*
 * Given a list of tickets, find itinerary in order using the given list.
 * Time: O(n)
 */
public class FindItinerary 
{
	public LinkedList<String> itinerary(HashMap<String, String> map)	// map contains (K, V) as (from, to)
	{
		LinkedList<String> list = new LinkedList<String>();
		Collection<String> coll = map.values();
		
		Set<String> set = map.keySet();
		String starting = "";
		String to = "";
		for(String s: set)
		{
			if(!coll.contains(s))
			{
				starting = s;
				list.add(starting);
			}
		}
		while(true)
		{
			to =  map.get(starting);
			if(to == null)
			{
				break;
			}
			list.add(to);
			starting = to;
				
		}
		return list;
		
	//another approach is to reverse the map and create another map by reversing and then iterate to find starting point.	
		
	}

}
