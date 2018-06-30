package SortingAndSearching;

public class LinearSearch
{
	public static void main(String[] args)
	{
		int a[] = {4, 6, 1, 3, 8, 9, 0, 7};
		System.out.println(linearSearch(a, 12));
		
	}
	
	/*
	 * returns index of x in the given array using linear search
	 * Time : O(n)
	 */
	public static int linearSearch(int[] given, int x)
	{
		int index = -1;
		for(int i = 0; i < given.length; i++)
		{
			if(given[i] == x)
			{
				index = i;
			}
			
		}
		
		return index;
	}

}
