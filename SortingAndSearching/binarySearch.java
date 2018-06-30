package SortingAndSearching;

import java.util.Arrays;

public class binarySearch 
{
	public static void main(String[] args)
	{
		int a[] = {4, 6, 1, 3, 8, 9, 0, 7};
		Arrays.sort(a);
		int result = binarySearchRecursive(a, 0, a.length-1, 4);
		String x  = (result == -1) ? "Element is not in the array" : "Element is present at : " + result;
		System.out.println(x);
		
		int result1 = binarySearchIterative(a, 0, a.length-1, 12);
		String x1  = (result1 == -1) ? "Element is not in the array" : "Element is present at : " + result1;
		System.out.println(x1);

	}

	/*
	 * Time O(log n)
	 */
	public static int binarySearchRecursive(int[] given,int start, int end, int x)
	{
		if(end >= start)
		{
			int middle = (start + end)/2;
			
			if(given[middle] == x)
			{
				return  middle;
			}
			else if(given[middle] < x)
			{
				return binarySearchRecursive(given, middle +1, end, x);
			}
			else
			{
				return binarySearchRecursive(given, 0, middle-1, x);
			}
			
		}
		else
		{
			return -1;
		}
	}
	
	public static int binarySearchIterative(int[] given,int start, int end, int x)
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
	
	

}
