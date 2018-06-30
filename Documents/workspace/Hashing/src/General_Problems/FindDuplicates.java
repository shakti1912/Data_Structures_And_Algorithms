package General_Problems;
import java.util.HashMap;
/*
 * Given an unsorted array that may contain duplicates.
 *  Also given a number k which is smaller than size of array.
 *  Write a function that returns true if array contains duplicates within k distance.
 */
public class FindDuplicates 
{
	/*
	 * Time: O(kn)
	 */
	public boolean find(int[] a, int k)
	{
		if(k >= a.length)
		{
			return false;
		}
		for(int i = 0 ; i < a.length; i++)
		{
			int temp = a[i];
			int j = i + k;
			for(int x = i + 1; x <= j && x < a.length; x++ )
			{
				if(a[x] == temp)
				{
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * Time: O(n)
	 */
	public boolean findHashing(int[] a, int k)
	{
		HashMap<Integer, Integer> map = new HashMap<>();	//	index, value

		for(int i = 0; i < a.length; i++)
		{
			int temp = a[i];
			if(map.containsKey(temp))
			{
				if(i <= map.get(temp) + k)
				{
					return true;	
				}
			}
			else 
			{
				map.put(temp, i);
			}
		}
		return false;
	}
}
