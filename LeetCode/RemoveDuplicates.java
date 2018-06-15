package LeetCode;

public class RemoveDuplicates 
{
	//this is a good efficient solution. another solution is by moving entire right array to left one step 
	//whenever i and i+1 values are equal
	public static int removeDuplicates(int[] nums) 
	{
		int index = 1;
		for(int i=1; i < nums.length; i++)
		{
			
			if (nums[i-1] != nums[i])
			{
				nums[index] = nums[i];
				index++;
			}
			
		}
		return index;

	}

	public static void main(String args[])
	{
		int[] a = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(a));
		
	}

}
