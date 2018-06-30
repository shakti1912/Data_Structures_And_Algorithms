package Hashing.General_Problems;
import java.util.HashMap;

public class SubsetArray 
{
	/*
	 * check if b is subset of a.
	 */
	public boolean subset(int[] a, int[] b)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < a.length; i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i] + 1));
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		for(int i = 0; i < b.length; i++)
		{
			if(!map.containsKey(b[i]))
			{
				return false;
			}
			
		}
		return true;
	}

}
