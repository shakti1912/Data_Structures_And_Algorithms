package LeetCode;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));

	}

	public static void moveZeroes(int[] nums) 
	{
		int numZeroes = 0;
		int cur = 0;
		for(int i=0; i < nums.length; i++)
		{
			if(nums[i] == 0)
			{
				numZeroes++;
			}
			else
			{
				nums[cur] = nums[i];
				cur++;
			}
			
		}
		for(int x = numZeroes; x >0; x--)
		{
			nums[nums.length-x] = 0;
			
		}	
		
	}

}
