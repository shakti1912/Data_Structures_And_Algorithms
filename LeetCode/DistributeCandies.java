package LeetCode;

import java.util.HashMap;
import java.util.Set;

public class DistributeCandies {
	
	public static int distributeCandies(int[] candies) 
	{
		int toGive = candies.length/2;
		int given = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i < candies.length; i++)
		{
			if(map.containsKey(candies[i]))
			{
				map.put(candies[i], map.get(candies[i]) + 1);
			}
			else
			{
				map.put(candies[i], 1);
			}
		}
		Set<Integer> set = map.keySet();
		if(set.size() <= toGive)
		{
			given = set.size();
		}
		else
		{
			given = toGive;
		}
		
		return given;
		
	}

	public static void main(String args[])
	{
		int[] candies = {1,1,2,2,3,3};
		System.out.println(distributeCandies(candies));
		
	}
}
