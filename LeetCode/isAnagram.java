package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class isAnagram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//System.out.println(isAnagram("cr", "arc"));
		System.out.println(findTheDifference("abcd", "abcde"));

	}

	public static boolean isAnagram(String s, String t) 
	{
		String S = sortedString(s);
		String T = sortedString(t);
		
		return S.equals(T);

	}

	public static String sortedString(String s)
	{
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
		
	}
	
	 public static char findTheDifference(String s, String t)
	    {
//		 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		 
//	        for(int i=0; i < t.length(); i++)
//	        {
//	        	if(map.containsKey(t.charAt(i)))
//	        	{
		 			// do this next time
		 			//map.put(c, map.getOrDefault(c, 0) + 1);
//	        		map.put(t.charAt(i), map.get(t.charAt(i))+1);
//	        	}
//	        	else
//	        	{
//	        		map.put(t.charAt(i), 1);
//	        	}
//	        	      	
//	        }
//	        for(int i=0; i < s.length(); i++)
//	        {
//	        	if(map.containsKey(s.charAt(i)))
//	        	{
//	        		map.put(s.charAt(i), map.get(s.charAt(i))-1);
//	        	}
//	        	else
//	        	{
//	        		map.put(s.charAt(i), 1);
//	        	}
//	        	      	
//	        }
//	        Set<Character> set = map.keySet();
//	        for(char c: set)
//	        {
//	        	if(map.get(c) == 1)
//	        	{
//	        		return c;
//	        	}
//	        }
//	        char res = ' ';
//	        return res;
//	      
		 int a = 0;
	      for(int i=0; i < t.length(); i++)
	      {
	    	  a = a + t.charAt(i);
	      }
	      System.out.println(a);
	      for(int i=0; i < s.length(); i++)
	      {
	    	  a = a - s.charAt(i);
	      }
	      System.out.println(a);
	      
	      
	      return (char) a;
	      
		 
	       
	        
	    }

}
