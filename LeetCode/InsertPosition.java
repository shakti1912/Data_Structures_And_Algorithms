package LeetCode;

public class InsertPosition 
{
	public static int pos(int[] nums, int target)
	{
		int position = -1;
		for(int i=0; i <  nums.length; i++)
		{
			if(nums[i] >= target)
			{
				return i;
			}
			
		}
		return nums.length;
	}
	public static void main(String args[])
	{
		int[] a = {1,3,5,6};
		System.out.println(pos(a, 7));
	}

}
