package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

//** DONE **

/*
 * Solution1: Done but not working for cases like : [0,0,3,4], target=0 because addition of same number is = target
 * Solution2: O(nlogn) working fine.
 * 
 */
public class TwoSumII 
{
	public static int[] twoSum(int[] numbers, int target)
	{
		int[] res = new int[2];
		
		LinkedHashMap<Integer, int[]> map = new LinkedHashMap<Integer, int[]>();
		for(int i=0; i < numbers.length; i++)
		{
			int[] temp = new int[2];
			temp[0] = target-numbers[i];
			temp[1] = i;
			if(!map.containsKey(numbers[i]))
			{
				map.put(numbers[i], temp);
			}
		}
		int var = -1;
		Set<Integer> set = map.keySet();
		for(int i: set)
		{
			if(map.containsKey(map.get(i)[0]))
			{
				res[0] = map.get(i)[1];
				var = i;
				break;
			}
		}
		res[1] = map.get(target-var)[1];
		return res;
		
	}
	
	public static int[] twoSum2(int[] numbers, int target)
	{
		int[] res = new int[2];
		for(int i=0; i < numbers.length; i++)
		{
			int index2 = BS(numbers, i+1, numbers.length-1, target-numbers[i]);
			if(index2 != -1)
			{
				res[0] = i;
				res[1] = index2;
			}
		}
		return res;
	}
	
	public static int BS(int[] given, int start, int end, int x)
	{
		int middle = -1;
		while(end >= start)
		{
			middle = (start + end) / 2;
			if(given[middle] == x)
			{
				
				return middle;
			}
			if(given[middle] < x)
			{
				start = middle + 1;
			}
			else
			{
				end = middle - 1;
			}			
		}		
		return -1;	
	}
	public static void main(String args[])
	{
		int[] n = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum2(n, 9)));			
	}
}
