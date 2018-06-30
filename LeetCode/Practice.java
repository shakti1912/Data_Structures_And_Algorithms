package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    
	public static void main(String[] args)
	{
		//int[] r = Practice.twoSum(new int[] {1, 3,4,5}, 8);
		//System.out.println(Arrays.toString(r));
	//	System.out.println((4 >> 1) ^ (8 >> 1));
		System.out.println(firstUniqChar("loveleetcode"));
		
		
		
	}
	public  static int[] twoSum(int[] nums, int target) 
    {
        int[] ret = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            int first = nums[i];
            for(int j = i +1 ; j< nums.length; j++)
            {
                int second = nums[j];
                if((first + second) == target)
                {
                    ret[0] = i;
                    ret[1] = j;
                    break;
                }    
            } 
        }
      return ret;  
        
    }
	
	    public static int firstUniqChar(String s)
	    {
	        Map<Character, Integer> map = new HashMap<Character, Integer>();
	        for(int i = 0; i < s.length(); i++)
	        {
	            char a = s.charAt(i);
	            if(map.containsKey(a))
	            {
	              //map.put(a, map.get(a) +1);
	              map.put(a, map.get(a) + 1);
	              continue;
	            }
	            
	            map.put(a,1); 
	            
	        }
	       
	        int i = 0;
	        for(Character c: map.keySet())
	        {
	            //System.out.println(c);
	           // System.out.println(map.get(c));
	            
	            if(map.get(c) == 1)
	            {
	                break;
	            }
	            i++;
	        }
	       return i; 
	        
	    }
	}
	