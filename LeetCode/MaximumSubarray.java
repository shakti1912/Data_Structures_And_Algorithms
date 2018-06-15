package LeetCode;
//Not Done yet. Working for alleast two elements in the subarray.
public class MaximumSubarray 
{
	
	public static int maxSubArray(int[] nums)
	{
		int[] subarray = new int[2];
		int maxSum = Integer.MIN_VALUE;

		for(int i=0; i < nums.length; i++)
		{
			int[] sub = new int[2];
			sub[0] = i;
			sub[1] = i;
			int sum = findSub(nums, sub, i);
			if(sum > maxSum){
				subarray[0] = sub[0];
				subarray[1] = sub[0];
				maxSum = sum;
			}

		}
		return maxSum;

	}
	public static int findSub(int[] n, int[] s, int index)
	{
		int sum = Integer.MIN_VALUE;
		int finalSum = Integer.MIN_VALUE;

		if(index + 1 < n.length)
		{
			sum = n[index] + n[index+1];
		}
		finalSum = sum;
		for(int i =index+2; i < n.length; i++)
		{
			sum = sum + n[i];
			if(sum > finalSum)
			{
				s[1] = i;
				finalSum = sum;
			}	
			
		}
		return finalSum;

	}
	public static void main(String args[])
	{
		int[] a = {-2,-3,-1};
		System.out.println(maxSubArray(a));

	}

}
