package Arrays;
// **DONE**
/*
	 * Write a program to print all the LEADERS in the array. 
	 * An element is leader if it is greater than all the elements to its right side. 
	 * And the rightmost element is always a leader. 
	 * For example in the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
	 * Let the input array be arr[] and size of the array be size.
	 */
public class FindLeaders
{
	/*
	 * Brute force = This is O(n*n) solution
	 * Approach: Two loops solution. One loop going over array one by one and inner loop comparing right subarray to this element.
	 */
	public int[] leaders(int[] a)
	{
		int[] x = new int[a.length];
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			int current = a[i];
			int j;
			for( j = i +1; j < a.length; j++)
			{
				if(a[j] > current)
				{
					break;
				}
				
			}
			if(j == a.length)
			{
				x[count] = current;
				count++;
			}
			
		}
		//x[count] = a[a.length-1];
		return x;
		
	}
	/*
	 * Optimal Solution. Time = O(n)
	 * Approach: go from right to left and keep track of largest element so far. if largest element changes, print it.
	 */
	public int[] leadersOptimal(int[] a)
	{
		int[] ret = new int[a.length];
		int c = 0;
		int len = a.length;
		int currentLargest = a[len-1];
		for(int i = len-1; i >= 0; i--)
		{
			if(a[i] >= currentLargest)
			{
				currentLargest = a[i];
				ret[c] = a[i];
				c++;
			}		
		}	
		return ret;	
	}
}
