package LeetCode;

import java.util.HashMap;

public class CanConstruct 
{

	public static boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(int i = 0; i < ransomNote.length(); i++)
		{
			char ch = ransomNote.charAt(i);
			if(map1.containsKey(ch))
			{
					map1.put(ch, map1.get(ch)+1);
			}
			else
			{
				map1.put(ch,1);
			}		
		}
		for(int i = 0; i < magazine.length(); i++)
		{
			char ch = magazine.charAt(i);
			if(map2.containsKey(ch))
			{
					map2.put(ch, map2.get(ch)+1);
			}
			else
			{
				map2.put(ch,1);
			}	
		}
		for(char c: map1.keySet())
		{
			if(!map2.containsKey(c))
			{
				return false;
			}
			else if(map2.get(c) >= map1.get(c))
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
		
		

	}
	public static void main(String args[])
	{
		System.out.println(canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
	}

}