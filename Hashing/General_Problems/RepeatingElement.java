package Hashing.General_Problems;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
/*
 * Given an array of integers, find the first repeating element in it. 
 * We need to find the element that occurs more than once and whose index of first occurrence is smallest
 */
public class RepeatingElement 
{
	public int repeat(int[] a)
	{
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int i = 0 ; i < a.length; i++)
		{
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1 );
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		Set<Integer> s = map.keySet();
		for(int i: s)
		{
			if(map.get(i) > 1)
			{
				return i;
			}
		}
		return Integer.MIN_VALUE;
		
	}
	
	// One more approach, inspite of using LinkedHashMap, we can use hashset and traverse the array from the end and keep track 
	// to repeating element. When we reach the front, the current repeating element is the first repeating element in the array
	
	public int repeating2(int[] a)
	{
		int rep = -1;

		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = a.length-1; i >= 0; i--)
		{
			if(set.contains(a[i]))
			{
				rep = i;
			}
			else
			{
				set.add(a[i]);
			}
		}
		if(rep == -1)
		{
			System.out.print("no repeating element exists."); 
			System.exit(0);
		}
		return a[rep];
	}

}
