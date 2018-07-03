package LeetCode;

/*
 * find peak element of a given array  in log n time
 * 
 */
public class FindPeakElement
{

	public static void main(String args[])
	{
		int[] a = {1,2,3,1};
		System.out.println(findPeakElement(a));
	}
	
	public static int findPeakElement(int[] nums) 
    {
//		int i = nums.length/2;
//		int power = 0;
//		int start = 0;
//		int end = nums.length;
//		 while(i>=0 && i <= nums.length)
//		 {
//			 
//			 
//			 
//			 
//			 
//		 }
//	        {
//	        	// sides different
//	        	if(nums[i-1] < nums[i]  && nums[i] > nums[i+1])
//	        	{
//	        		return i;
//	        	}
		
		int len = nums.length;
		int i = nums.length/2;
		int next = i;
		int y = i;
		
		int start = 0;
		int end = nums.length-1;
		int middle = -1;
		while(end > start)
		{
			middle = (start + end) / 2;
			if(nums[middle] > nums[middle+1])
			{
				end = middle;
			}
			else
			{
				start = middle + 1;
			}
			
		}
		
		return start;
    }
//        while(i >= 1 && i < nums.length-1)
//        {
//        	// sides different
//        	if(nums[i-1] < nums[i]  && nums[i] > nums[i+1])
//        	{
//        		return i;
//        	}
//        	// decreasing
//        	if(nums[i-1] > nums[i] && nums[i] > nums[i+1])
//        	{
//        		i = i/2;	
//        	}
//        	//increasing
//          if(nums[i-1] < nums[i] && nums[i] < nums[i+1])
//          {
//        	  i = i+i/2;	
//          }
//        }
//        return i;
//        
//    }
}
