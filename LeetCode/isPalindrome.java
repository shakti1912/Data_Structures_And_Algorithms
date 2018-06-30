package LeetCode;

import java.util.ArrayList;

public class isPalindrome 
{
	public static boolean isPalindrome(int x) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(x < 0)
		{
			return false;
		}
		while(x>0)
		{
			list.add(x%10);
			x = x/10;
		}
		int left = 0;
		int right = list.size()-1;
		while(left < right)
		{
			if(list.get(left) != list.get(right))
			{
				return false;
				
			}
			
			else
			{
				left++;
				right--;
			}
		}
		return true;				
	}
	
	public static void main(String args[])
	{
		System.out.println(isPalindrome(12321));
	}

}
