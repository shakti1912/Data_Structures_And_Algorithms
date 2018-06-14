package LeetCode;

import java.util.HashMap;

public class RomanToInteger
{
	public static int toInt(String roman)
	{
		int x  = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int i =0;
		while(i < roman.length())
		{
			
			if ((i+1) < roman.length() && roman.charAt(i) == 'I' && roman.charAt(i+1) == 'V')
			{
				x = x + 4;
				i = i + 2;
			}
			else if ((i+1) < roman.length() && roman.charAt(i) == 'I' && roman.charAt(i+1) == 'X')
			{
				x = x + 9;
				i = i  + 2;
			}
			else if ((i+1) < roman.length() && roman.charAt(i) == 'X' && roman.charAt(i+1) == 'L')
			{
				x = x + 40;
				i = i + 2;
			}
			else if ((i+1) < roman.length() && roman.charAt(i) == 'X' && roman.charAt(i+1) == 'C')
			{
				x = x + 90;
				i = i + 2;
			}
			else if ((i+1) < roman.length() && roman.charAt(i) == 'C' && roman.charAt(i+1) == 'D')
			{
				x = x + 400;
				i = i + 2;
			}
			else if ((i+1) < roman.length() && roman.charAt(i) == 'C' && roman.charAt(i+1) == 'M')
			{
				x = x + 900;
				i = i + 2;
			}
			else
			{
				x = x + map.get(roman.charAt(i));
				i = i + 1;
			}	
			
		
		}
		return x;
	}
	public static void main(String[] args)
	{
		System.out.println(toInt("MCMXCIV"));
		
	}

}
