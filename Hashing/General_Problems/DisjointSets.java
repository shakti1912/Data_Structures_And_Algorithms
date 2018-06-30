package Hashing.General_Problems;

import java.util.HashMap;

/*
 * Given two sets represented by two arrays, how to check if the given two sets are disjoint or not? 
 * It may be assumed that the given arrays have no duplicates.
 */
public class DisjointSets {

	public boolean areDisjoint(int[] a, int[] b)
	{
		HashMap<Integer, Integer> map = new HashMap<>();	//	element, numberofoccurrences

		for(int i = 0; i < a.length; i++)
		{
			int temp = a[i];
			map.put(temp, i);
		
		}
		for(int i = 0; i < b.length; i++)
		{
			int temp = b[i];
			if(map.containsKey(temp))
			{
				return false;
			}
		}
		return true;
	}
}
