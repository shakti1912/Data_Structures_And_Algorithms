package General_Problems;
import java.util.HashMap;

public class DivideArray
{
	public boolean divide(int[] a, int divisor)
	{
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int rem = -1;
		for(int i =0; i < a.length; i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
			}
			else
			{
				map.put(a[i], 1);
			}				
		}
		for(int i =0; i < a.length; i++)
		{
			int first = a[i];
			int sec = divisor - (first % divisor); // this is 6 - (9%6)  = 6 - 3 = 3 so 3 three should be in map if we need sum of first 
													// and sec is divisible by given divisor
			if(map.containsKey(first) && map.containsKey(sec))
			{ 
				count++;
			}	
		}
		if(count*2 == a.length)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
