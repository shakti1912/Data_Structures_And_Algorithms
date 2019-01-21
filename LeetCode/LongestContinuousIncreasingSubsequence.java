package LeetCode;

import java.util.HashSet;
import java.util.Set;
//not done
public class LongestContinuousIncreasingSubsequence {

	public static int findLengthOfLCIS(int[] nums) 
	{
		int len = 0;
		Set<Integer> set = new HashSet<Integer>();
		int j = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(!set.contains(nums[i]))
			{
				set.add(nums[i]);
				len++;			
			}
			else
			{
				set.remove(nums[j]);
				j++;
			}
			len = Math.max(len, i-j);
			
			
		}
		return len;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = 	{1,3,5,4,7};
		int r = findLengthOfLCIS(x);
		System.out.println(r);

	}

}
