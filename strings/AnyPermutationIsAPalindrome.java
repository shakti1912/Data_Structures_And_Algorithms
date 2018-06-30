package strings;

import java.util.HashMap;
import java.util.Set;

public class AnyPermutationIsAPalindrome {

	public static void main(String args[])
	{
		System.out.println(check("shakti"));
	}
	public static boolean check(String s)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c: s.toCharArray())
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		Set<Character> set = map.keySet();
		int mid = 0;
		
		for(char c: set)
		{
			if(map.get(c) % 2 == 1)
			{
				if(mid < 1)
				{
				mid++;
				}
				else
				{
					return false;
				}
			}
			
		}
		return true;
	}
}
