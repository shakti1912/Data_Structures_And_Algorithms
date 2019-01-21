package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber 
{
	public static List<Integer> selfDividingNumbers(int left, int right)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = left; i < right+1; i++)
		{
			if(checkDivide(i))
			{
				list.add(i);
			}
		}
		return list;
		
	}
	
	public static boolean checkDivide(int num)
	{
		int n = num;
		while(n > 0)
		{
			int c = n%10;
			
			
			
			if(c == 0 || num%c != 0)
			{
				return false;
			}
			n = n/10;
			
		}
		return true;
		
	}
	public static void main(String args[])
	{
		
		System.out.println(selfDividingNumbers(1,10000).toString());
	}

}
