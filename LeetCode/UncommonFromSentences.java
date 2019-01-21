package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class UncommonFromSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A = "apple apple";
		String B = "ban";
		System.out.println(Arrays.toString(uncommonFromSentences(A, B)));
		

	}
	public static String[] uncommonFromSentences(String A, String B)
	{
		ArrayList<String> list = new ArrayList<String>();
		String[] wordsA = A.split("\\s+");
		String[] wordsB = B.split("\\s+");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i< wordsA.length; i++)
		{
			if(map.containsKey(wordsA[i]))
			{
				map.put(wordsA[i], map.get(wordsA[i])+1);
			}
			else
			{
				map.put(wordsA[i], 1);
			}
				
		}
		
		for(int i = 0; i< wordsB.length; i++)
		{
			if(map.containsKey(wordsB[i]))
			{
				map.put(wordsB[i], map.get(wordsB[i])+1);
			}
			else
			{
				map.put(wordsB[i], 1);
			}
				
		}
		Set<String> set = map.keySet();
		for(String s: set)
		{
			if(map.get(s) == 1)
			{
				list.add(s);
			}
			
		}
//		String[] res = new String[list.size()];
//		for(int i = 0; i< list.size(); i++)
//		{
//			res[i] = list.get(i);
//			
//		}
//		return res;
		
		String[] res = list.toArray(new String[list.size()]);
		return res;
			

	}

}
