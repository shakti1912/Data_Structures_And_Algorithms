package LeetCode;

public class Check_Possibilities {
	
	public static void main(String[] args)
	{
		int[] nums = {4,2,1};
		System.out.println(checkPossibility(nums));
	}
	public static boolean checkPossibility(int[] nums) 
	{
		for(int i=0; i< nums.length; i++)
		{
			
			if(check_sorted(nums, 0, i))
			{
				if(check_sorted(nums, i, nums.length))
				{
					if(nums[i] < nums[i+1])
					{
						return true;
					}
					else
					{
						return false;
					}
				}				
			}
		}
		return false;			    
	}
	public static boolean check_sorted(int[] nums, int a, int b)
	{
		for(int i = a+1; i< b; i++)
		{
			if(nums[i-1] > nums[i])
			{
				return false;
			}
			
		}
		return true;
	}
	
}
