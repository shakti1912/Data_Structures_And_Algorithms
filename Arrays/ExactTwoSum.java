package Arrays;
import java.util.Arrays;
// **DONE**
/*
 * given an array A[] of n numbers and another number x,
 *  determines whether or not there exist two elements in A whose sum is exactly x.
 */
public class ExactTwoSum 
{
	/*
	 * Brute Force solution
	 * Time : O(n*n)
	 */
	public boolean TwoSum(int[] a, int sum)
	{
		boolean ret = false;
		for(int i = 0; i < a.length; i++)
		{
			int current = a[i];
			int j;
			for( j = i +1; j < a.length; j++)
			{
				if(current + a[j]  ==  sum)
				{
					ret = true;
					break;
				}
				
			}
		}
		return ret;
	}
	
	/*
	 * First sorting the array and processing it.
	 * Time: Depends on sorting algorithm being used. O(n*log n)
	 */
	public boolean TwoSum2(int[] a, int sum)
	{
		boolean ret = false;
		Arrays.sort(a);
		int start = 0;
		int last = a.length-1;
		while(start < last)
		{
			if((a[start] + a[last]) == sum)
			{
				ret = true;
				break;
			}
			else if((a[start] + a[last]) < sum)
			{
				start++;
			}
			else
			{
				last--;
			}
		}
		return ret;
		
	}
	
	
	

}
