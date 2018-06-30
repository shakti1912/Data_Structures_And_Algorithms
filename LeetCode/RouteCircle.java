package LeetCode;

public class RouteCircle 
{
	public static boolean judgeCircle(String moves) 
	{
		int[] location = new int[2];
		location[0] = 0;
		location[1] = 0;
		for(Character c: moves.toCharArray())
		{
			if(c == 'R')
			{
				location[0] = location[0] + 1;
			}
			if(c == 'L')
			{
				location[0] = location[0] - 1;
			}
			if(c == 'D')
			{
				location[1] = location[1] - 1;
			}
			if(c == 'U')
			{
				location[1] = location[1] + 1;
			}
			
		}
		return location[0] == 0 && location[1] == 0;
		
		
	}
	
	public static void main(String args[])
	{
		
		System.out.println(judgeCircle("RLU"));
	}

}
