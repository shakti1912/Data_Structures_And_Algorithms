package SortingAndSearching;

import java.util.Arrays;

public class jumpSearch 
{
	public static void main(String[] args)
	{
		int a[] = {4, 6, 1, 3, 8, 9, 0, 7};
		Arrays.sort(a);   // {0,1,3,4,6,7,8,9}
		int blockSize = 4;
		System.out.println(jumpSearch(a, blockSize, 8));

	}

	public static int jumpSearch(int[] a, int size, int x )
	{
		// find the right block where x lies
		int left = 0;
		int right = size; //optimal size is squareroot of a.length

		while( right < a.length && a[right] <= x )
		{
			left  = right;
			right += size;

			if(right > a.length - 1)
			{
				right = a.length;
			}
		}

		for(int i = left; i < right; i++)
		{
			if(a[i] == x)
			{
				return i;
			}
		}
		return -1;

	}

}
