package Arrays;
import java.util.Collection;
// **DONE **
import java.util.HashMap;
/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Solution: Brute force using two loops. Time = O(n)
 * 		   : Using HashMap. Time = O(n), Space = O(n) => (My Solution)
 * 		   :  Using XOR. Best Solution. Time = O(n) , Space = O(1) 
 */
public class OddTimes
{
	public int oddNumberOfTimes(int[] a)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < a.length; i++)
		{
			int key = a[i];
			if(map.containsKey(key))
			{
				map.put(key, map.get(key)+1);			
			}
			else
			{
				map.put(key, 1);
			}	
		}
		
		Collection<Integer> keys = map.keySet();
		for(int i: keys)
		{
			if(map.get(i) % 2 == 1)
			{
				return i;
			}
		}
		System.out.println("None found. Returning -1");
		return -1;
	}
	/*
	 * XOR all the elements of the  array this will give us odd occurring element.
	 * Time : O(n)
	 * Space : O(1)
	 */
	public int bestSolution(int[] a)
	{
		int res = 0;
		for (int i = 0; i < a.length; i++) 
        {
            res = res ^ a[i];
        }
        return res;
	}
}
