package LeetCode;

public class RemoveElement
{
	public static int removeElement(int[] nums, int val) 
	{
		int newLength = 0;
		int i =0;
		int x =0;
		while(i < nums.length && x < nums.length)
		{
			if(nums[i] == val)
			{
				rearrangeArray(nums, i);		
				nums[nums.length-1] = 100+1;
			}
			else
			{
				i++;
				newLength++;
			}
			x++;

		}
		return newLength;


	}
	public  static void rearrangeArray(int[] a, int index)
	{
		for(int i = index; i<a.length-1; i++)
		{
			a[i] = a[i+1];
		}


	}
	public static void main(String args[])
	{
		int[] arr = {3,2,2,3};
		System.out.println(removeElement(arr, 2));
	}

}
