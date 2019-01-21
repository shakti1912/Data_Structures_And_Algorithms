package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class LongestWordInDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] words = {"a", "banana", "app", "appl","ap", "applw","appla","apple"};
		String[] words =  {"vsw","vs","zwu","vsx","nc","o","vswus","orv","imf","i","v","zw","vs"};
		System.out.println(longestWord(words));

	}

	public static String longestWord(String[] words) 
	{
		//sort the array
		//Arrays.sort(words);
		Arrays.sort(words, (a, b)->Integer.compare(a.length(), b.length()));
		//System.out.println(Arrays.toString(words));
		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		for(String word: words)
		{
			int len =word.length();
			if(map.containsKey(len))
			{
				map.get(len).add(word);
			}
			else
			{
				ArrayList<String> list = new ArrayList<String>();
				list.add(word);
				map.put(len, list);
			}

		}
		//System.out.println(map);
		for(int i= words.length-1; i >= 0; i--)
		{
			String current = words[i];
			boolean indicator = false;	// to continue indicator
			//break it
			int key = 0;
			for(int j =1; j < current.length(); j++)
			{
				String temp = current.substring(0, j);
				key = j;
				if(!map.containsKey(key))
				{
					break;
				}
				if(!map.get(key).contains(temp))
				{
					indicator = true;
					break;			
				}
				
				
			}
			
			//if indicator is false then we only need to check those words that are same length as current word
			if(!indicator)
			{
				ArrayList<String> l = map.get(key+1);
				Collections.sort(l);
				return l.get(0);
			}
			
			
		}
		return "";


	}


}
