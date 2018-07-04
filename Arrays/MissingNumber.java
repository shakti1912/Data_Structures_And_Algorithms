package Arrays;
// **DONE**
/*
 * You are given a list of n-1 integers and these integers are in the range of 1 to n. 
 * There are no duplicates in list. One of the integers is missing in the list. 
 * Write an efficient code to find the missing integer.
 */
public class MissingNumber 
{
	/*
	 * Brute Force solution: Time O(n*n)
	 */
	public int missing(int[] a)
	{ 
		int len = a.length+1;
		int[] temp = new int[len];
		for(int i =0; i < temp.length; i++)
		{
			temp[i] = i+1;		
		}
		for(int i=0; i < temp.length; i++)
		{		
			int current = temp[i];
			int j;
			for( j = 0; j < a.length; j++)
			{
				if((a[j] == current))
				{
					break;
				}
			}
			if(j == a.length)
			{
				return current;
			}		
		}
		System.out.println("None found. Returning -1");
		return -1;
	}
	/*
	 * Using Sum Formula.
	 * Using sum formula (n*n+1/2)  to get sum of all the numbers from 1 to n. Then iterate
	 * through the array and subtract each element. Remaining sum is the missing number.
	 * Time : O(n)
	 */
	public int usingSum(int[] a)
	{
		int n = a.length + 1;
		int sum = (n*(n+1))/2;
		
		for(int i = 0; i < a.length; i++)
		{
			int c = a[i];
			sum =sum - c;
		}
		return sum;	
	}
	/*
	 * Using XOR.
	 * X1 = A1^A2^A4
	 * X2 = A1^A2^A3^A4
	 * X1 ^ X2 = (A1^A2^A4) ^ (A1^A2^A3^A4)
	 * 			 = (A1 ^ A1) ..... ^ A3
	 * 			= 0 ^ 0 ^ 0 ^ A3
	 * 			= A3 (which is the missing number)
	 * 
	 * Time Complexity : O(n)
	 */
	public int usingXOR(int[] a)
	{
		int x1 = 1;
		int x2 = a[0];
		for(int i =0; i < a.length+1; i++)
		{
			x1 = x1 ^ (i+1);	
		}
		for(int i =0; i < a.length; i++)
		{
			x2 = x2 ^ a[i];	
		}
		
		return x1 ^ x2;
		
		
	}
}
