package Hashing.Leetcode_HashTable;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyboardRow {

	public static String[] findWords(String[] words) 
	{
		String[] ret = new String[words.length];
		int index = 0;
		ArrayList<Character> first = new ArrayList<Character>();

		ArrayList<Character> second = new ArrayList<Character>();

		ArrayList<Character> third = new ArrayList<Character>();
		first.add('Q');
		first.add('W');
		first.add('E');
		first.add('R');
		first.add('T');
		first.add('Y');
		first.add('U');
		first.add('I');
		first.add('O');
		first.add('P');

		second.add('A');
		second.add('S');
		second.add('D');
		second.add('F');
		second.add('G');
		second.add('H');
		second.add('J');
		second.add('K');
		second.add('L');

		third.add('Z');
		third.add('X');
		third.add('C');
		third.add('V');
		third.add('B');
		third.add('N');
		third.add('M');

		HashMap<ArrayList<?>, Integer> map = new HashMap<ArrayList<?>, Integer>();
		map.put(first, 0);
		map.put(second, 1);
		map.put(third, 2);

		for(String s: words)
		{
			int theOne = -1;
			int i = -1;
			if(first.contains(s.charAt(0)))
			{
				theOne = 0;
				 
			}
			if(second.contains(s.charAt(0)))
			{
				theOne = 1;
			}
			if(third.contains(s.charAt(0)))
			{
				theOne = 2;
			}
			i = theOne;


			for(char c: s.toCharArray())
			{
				if(first.contains(c))
				{
					if(theOne == 0)
					{
						continue;
					}
					else
					{
						break;
					}
				}
				if(second.contains(c))
				{
					if(theOne == 1)
					{
						continue;
					}
					else
					{
						break;
					}
				}
				if(third.contains(c))
				{
					if(theOne == 2)
					{
						continue;
					}
					else
					{
						break;
					}
				}

			}
			if(theOne != -1)
			{
				ret[index] = s;
				index++;
			}
		}

		return ret;
	}

	public static void main(String args[])
	{
		String[] Input =  {"Hello", "Alaska", "Dad", "Peace"};
		String[] Output = findWords(Input);
		for(String s: Output)
		{
			System.out.println(s);
		}
	}
}
