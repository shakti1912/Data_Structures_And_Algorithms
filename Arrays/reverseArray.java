package Arrays;

// **DONE**
public class reverseArray 
{
	/*
	 * a is given array
	 * n is length of the array
	 * Time : O(n/2) = O(n)
	 */
	public int[] reverse(int[] a, int n)
	{
		for(int i =0; i < n/2; i++)
		{
			int temp = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = temp;		
		}
		return a;
	}
	
	public int[] recursiveReverse(int[] a, int start, int end)
	{
		if(start > end)
		{
			return a;
		}
		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;
		return recursiveReverse(a, start+1, end-1);	
	}
	
	

}
