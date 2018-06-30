package Hashing.General_Problems;
import java.util.LinkedHashMap;
import java.util.Set;

/*
 * Given an unsorted array with repetitions, the task is to group multiple occurrence of individual elements.
 *  The grouping should happen in a way that the order of first occurrences of all elements is maintained.
 *  
 *  Time: O(n)
 */
public class GroupOccurrences 
{
	int[] arr;
	int index;
	
	public int[] group(int[] a)
	{
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>(); 	//	element, numberofoccurrences
		arr =a;
		index = 0;
		for(int i = 0 ;i < a.length; i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		
		Set<Integer> s = map.keySet();
		for(int i: s)
		{
			inArray(map.get(i), i);
		}
		return a;
		
	}
	
	public void inArray(int x, int val)
	{
		while( x > 0)
		{
			arr[index] = val;
			index++;
			x--;
		}	
	}

}
