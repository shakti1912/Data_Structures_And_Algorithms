package LeetCode;

import java.util.ArrayList;

public class ValidParentheses 
{
	public static boolean isValid(String s) 
	{
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0; i < s.length(); i++)
		{
			list.add(s.charAt(i));
		}
		int x = 0;
		while(x < list.size())
		{
			if(x+1 < list.size())
			{
				if(list.get(x) == '{' && list.get(x+1) == '}' || list.get(x) == '(' && list.get(x+1) == ')'
						|| list.get(x) == '[' && list.get(x+1) == ']')
				{
					list.remove(x);
					list.remove(x);
					x = 0;
					continue;
				}
			}
			x = x + 1;

		}
		if (x == 0){
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String args[])
	{
		System.out.println(isValid("{}[]"));
	}

}
