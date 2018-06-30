package Hashing.General_Problems;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Find Maximum occuring char in a string.
 * Time: O(n)
 * Space: O(n) but can be 1 if we restrict chars to 256 as ASCII
 */
public class MaximumChar
{
	public char maximum(String s)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c: s.toCharArray())
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> entry = map.entrySet();
		Integer max = new Integer(0);
		char c = ' ';
		for(Entry e: entry)
		{
			
			if(Integer.compare((int) e.getValue(), max) > 0)
			{
				max =  (int) e.getValue();
				c = (char) e.getKey();
			}
			
		}
		return c;
		
		
	}

}
