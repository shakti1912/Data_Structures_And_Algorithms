package Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
// **DONE** 
/*
 * Given two arrays, write a function to compute their intersection.
 */
public class ArrayIntersection {

	public static int[] intersection(int[] nums1, int[] nums2) 
	{
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> setresult = new HashSet<Integer>();
		
		for(int i=0; i < nums1.length; i++)
		{
			set.add(nums1[i]);
		}
		for(int i=0; i < nums2.length; i++)
		{
			if(set.contains(nums2[i]))
			{
				setresult.add(nums2[i]);
			}
		}
		int[] finalResult = new int[setresult.toArray().length];
		int index = 0;
		Iterator<Integer> iter = setresult.iterator();
		while(iter.hasNext())
		{
			finalResult[index] = iter.next();
			index++;
		}
		return finalResult;	

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] res = (intersection(nums1, nums2));
		for(int i=0; i < res.length; i++)
		{
			System.out.print(res[i] + " ");
		}

	}

}
