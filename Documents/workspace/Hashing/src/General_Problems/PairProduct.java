package General_Problems;
import java.util.HashMap;
import java.util.HashSet;

/*
 * Given an array and a number x, find if there is a pair with product equal to x.
 * 
 * Time: O(n)
 */
public class PairProduct 
{
	public boolean equalProduct(int[] a, int k)
	{
		//HashMap<Integer, Integer> map = new HashMap<>();	//	index, value
		HashSet<Integer> map = new HashSet<>();	// no need for hashmap. we just need set.
		for(int i = 0 ; i < a.length; i++)
		{
			
			int val = a[i];
			if(val == 0 && k == 0)
			{
				return true;
			}
			int left = k/val;
			if(k % val == 0 && map.contains(left))
			{
				return true;
			}
			else
			{
				//map.put(val,1);
				map.add(val);
			}
		}
		return false;
	}

}
