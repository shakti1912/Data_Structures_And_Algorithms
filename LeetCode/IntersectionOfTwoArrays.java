package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays 
{

	public static void main(String args[])
	{
		int[] nums1 = {9,4,9,8,4};
		int[] nums2 = {4,9,5};
		System.out.println(Arrays.toString(intersect(nums1, nums2)));

	}
	public static int[] intersect(int[] nums1, int[] nums2)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums1.length; i++)
		{
			if(map1.containsKey(nums1[i]))
			{
				map1.put(nums1[i], map1.get(nums1[i])+1);
			}
			else
			{
				map1.put(nums1[i], 1);
			}

		}
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums2.length; i++)
		{
			if(map2.containsKey(nums2[i]))
			{
				map2.put(nums2[i], map2.get(nums2[i])+1);
			}
			else
			{
				map2.put(nums2[i], 1);
			}

		}
		// lets use nums1
		for(int i = 0; i < nums1.length; i++)
		{
			int key = nums1[i];
			if(map2.containsKey(key) && map2.get(key) > 0)
			{
				list.add(key);
				map2.put(key, map2.get(key)-1);

			}

		}
		int[] res = new int[list.size()];
		for(int i=0; i< res.length; i++)
		{
			res[i] = list.get(i);
		}
		return res;
		
	}

	//	public static int[] intersect(int[] nums1, int[] nums2)
	//	{
	//		int use = -1;
	//		ArrayList<Integer> list = new ArrayList<Integer>();
	//		if(nums1.length > nums2.length)
	//		{
	//			use = 2;					
	//		}
	//		else
	//		{
	//			use = 1;
	//		}
	//		if(use == 1)
	//		{
	//			for(int i = 0; i < nums1.length; i++)
	//			{
	//				if(contain(nums2, nums1[i]))
	//				{
	//					list.add(nums1[i]);
	//
	//				}
	//
	//			}
	//
	//		}
	//		else
	//		{
	//			for(int i = 0; i < nums2.length; i++)
	//			{
	//				if(contain(nums1, nums2[i]))
	//				{
	//					list.add(nums2[i]);
	//
	//				}
	//
	//			}
	//
	//		}
	//		int[] res = new int[list.size()];
	//		for(int i=0; i< res.length; i++)
	//		{
	//			res[i] = list.get(i);
	//		}
	//		return res;
	//
	//
	//
	//	}
	public static boolean contain(int[] nums, int val)
	{
		for(int i =0; i < nums.length; i++)
		{
			if(nums[i] == val)
			{
				return true;
			}
		}
		return false;
	}


}
