package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,3};
		System.out.println(firstMissingPositive(nums));

	}

	public static int firstMissingPositive(int[] nums)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i=0; i < nums.length; i++)
	    {
	        map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
	    }
	    System.out.println(map.toString());
	    int max = nums.length/2;
	    System.out.println(max);

	    Set<Integer> s = map.keySet();
	    for(int i: s)
	    {
	    	if(map.get(i) > max)
	    	{
	    		return i;
	    	}
	    	
	    }
	    return -1;
	    
	    	
//		int[] new_arr = new int[nums.length+1];
//        for(int i=0; i < nums.length; i++)
//        { 
//        	int val = nums[i]; 
//        	if(val >=0 && val <= nums.length)
//        	{
//        			new_arr[val] = 1;
//        		
//        	}
//     	
//        }
//        for(int i=1; i < new_arr.length; i++)
//        {
//        	if(new_arr[i] == 0)
//        	{
//        		return i;
//        	}
//        }
//        return nums.length+1;
	    
	    
	    
//		Arrays.sort(nums);
//		if(nums[0]>1)
//		{
//			return 1;
//		}
//		for(int i=0; i < nums.length-1; i++)
//		{
//			if(nums[i] + 1 == 0)
//			{
//				if(i+1 < nums.length && nums[i]+2 == nums[i+1])
//				{
//					continue;
//				}
//				else
//				{
//					return nums[i]+2;
//				}
//				
//			}
//			else
//			{
//				if(nums[i]+1 != nums[i+1] && nums[i] >= 0)
//				{
//					return nums[i]+1;
//				}
//			}		
//		}
//		return nums[nums.length-1]+1;
//		
			
	}
	
	


}
