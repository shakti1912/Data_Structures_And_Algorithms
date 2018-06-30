package Hashing.General_Problems;
import java.util.Arrays;
import java.util.HashSet;

/*
 * given an array A[] of n numbers and another number x, 
 * determines whether or not there exist two elements in S whose sum is exactly x.
 */
public class PairEqualSum
{
	
	//brute force way. Using two loops.
	// Time: O(n2)
	public boolean equalSum(int[] n, int x)
	{
		for(int i = 0; i < n.length; i++)
		{
			int required = x - n[i]; 	// sum - current# = required
			for(int j = 0; j < n.length && j != i ; j++)
			{
				if(n[j] == required)
				{
					return true;	
				}
			}
		}
		return false;			
	}
	
	// Using sorting method.
	// using quicksort method.
	// Time: O(nlogn)
	public boolean equalSum2(int[] n, int x)
	{
		Arrays.sort(n);
		int l = 0;
		 int r = n.length -1;
		 
		 while(l < r)
		 {
			 if(n[l] + n[r] == x)
			 {
				 return true;
			 }
			 else if(n[l] + n[r] < x)
			 {
				l++; 
			 }
			 else
			 {
				 r--;
			 }
		 }
		 return false;
	}
	
	//using hashing but does not work for negative numbers.
	//Time :O(n)
	//Space : O(R) where R is the range of integers.
	//
	public boolean equalSum3(int[] n, int x)
	{
		boolean[] binmap = new boolean[1000000]; // size of map is big to accomodate all the numbers of the array. 
		for(int i = 0; i < n.length; i++)
		{
			int temp = x - n[i];
			if(temp >= 0  && binmap[temp])
			{
				return true;
			}
			binmap[n[i]] = true;
		}
		return false;
	}
	
	//	 Using HashSet. 
	//	 Time: O(n)
	//	 Space : O(n)
	public boolean equalSum4(int[] n, int x)
	{
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < n.length; i++)
		{
			if(set.contains(x - n[i]))
			{
				return true;
			}
			set.add(n[i]);
		}
		return false;
		
	}

}
