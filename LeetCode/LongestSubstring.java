package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
// **Done**
public class LongestSubstring 
{
	/*
	 * 
	 Brute force.  
	Time Complexity: O(n^3)
	 * 
	 */
	public static int lengthOfLongestSubstring(String s) 
	{
		
		int[] x = new int[2];
		 if(s.isEmpty())
	        {
	            return 0;

	        }
		int len = 1;
		int index  = 0;
		for(int i=0; i < s.length(); i++)
		{
			int tempLen = 0;
			ArrayList<Character> list = new ArrayList<Character>();
			for(int j = i; j < s.length(); j++)
			{
				if(!list.contains(s.charAt(j)))
				{
					list.add(s.charAt(j));
					tempLen++;
				}
				else
				{
					break;
				}
				
			}
			//tempLen += 1;
			if(tempLen > len)
			{
				len = tempLen;
				index = i;
			}
			list = null;
			//list = new ArrayList<Character>();
			
		}
		x[0] = len;
		x[1] = index;
		return len;
		
		
	}
	
	/*
	 solution from leetcode. here at the end, set is used as a helping ds. it does not contain the actual 
	 substring. 
	Time Complexity: O(n)
	 * 
	 */
	    public static int lengthOfLongestSubstring2(String s) {
	        int n = s.length();
	        Set<Character> set = new HashSet<>();
	        int ans = 0, i = 0, j = 0;
	        while (i < n && j < n) {
	            // try to extend the range [i, j]
	            if (!set.contains(s.charAt(j))){
	                set.add(s.charAt(j++));
	                ans = Math.max(ans, j - i);
	            }
	            else {
	                set.remove(s.charAt(i++));
	            }
	        }
	        return ans;
	    }
	
	public static void main(String args[])
	{
		String s = "abcbcabb";
		int x = lengthOfLongestSubstring(s);
		System.out.println(x);
		//System.out.println(s.substring(x[1], x[1]+x[0]));
		
		
	}

}
