package Leetcode_HashTable;

import java.util.HashMap;

public class JewelsAndStones 
{

	public static int numJewelsInStones(String J, String S) 
	{
		int numJewels = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c: S.toCharArray())
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
		for(char c: J.toCharArray())
		{
			if(map.containsKey(c))
			{
				numJewels = numJewels + map.get(c);
			}
		}
		return numJewels;
		
		

	}
	public static void main(String args[]){
		System.out.println(numJewelsInStones("aA","aAAbbbb"));
	}
}
