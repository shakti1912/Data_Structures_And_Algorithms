package LeetCode;

import java.util.Arrays;

public class ArrayPairSum
{
	public static void main(String args[])
	{
		int[] sums = {1,4,3,2};
		System.out.println(pairSum(sums));
		
	}
	
	public static int pairSum(int[] sums)
	{
		Arrays.sort(sums);
		int sum = 0;
		for(int i=0; i < sums.length; i=i+2)
		{
			sum = sum + sums[i];			
		}
		return sum;
		
		
	}

}
