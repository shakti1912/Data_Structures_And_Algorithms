package Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
// **DONE**
/*
 * My solution is using hashmap. 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class MajorityElement 
{
	public int majority(int[] a)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < a.length; i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i]) + 1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		
		
		Collection<Integer> keys = map.keySet();
		//Collection<Integer> s = map.values();
		int index = -1;
		for(int i: keys)
		{
			int val = map.get(i);
			if(val > a.length/2)
			{
				index = i;
				break;
			}
		}
		return index;		
	}
	/*
	 * Moore's Voting Algorithm
	 */
	public int MooreVotingAlgorithm(int[] a)
	{
		int maj_index = 0;
		int count = 1;
		
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] == a[maj_index])
			{
				count++;
			}
			else
			{
				count--;
			}
			if(count == 0)
			{
				maj_index = i;
				count = 1;
			}
			
		}
		return a[maj_index];
		
	}

}
