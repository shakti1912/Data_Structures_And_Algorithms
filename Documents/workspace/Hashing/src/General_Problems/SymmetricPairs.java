package General_Problems;
import java.util.HashMap;

/*
 * Two pairs (a, b) and (c, d) are said to be symmetric if c is equal to b and a is equal to d.
 *  For example (10, 20) and (20, 10) are symmetric. Given an array of pairs find all symmetric pairs in it.
 * 
 * Idea: First element of pair is used as key and second element is used as value in the hashmap.
 * Time: O(n)
 */
public class SymmetricPairs 
{
	//this is way to make tuple in java.
	public class Pair
	{
		int a;
		int b;
		public Pair(int a, int b)
		{
			this.a = a;
			this.b = b;
		}
	}
	public int pairs()
	{
		int count  = 0;
		Pair[] pairs = new Pair[6];
		pairs[0] =  new Pair(11, 20);
		pairs[1] = new Pair(30, 40);
		pairs[2]= new Pair(	5, 10);
		pairs[3] = new Pair(40, 30);
		pairs[4] = new Pair(10, 5);
		pairs[5] = new Pair(20,11);

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < pairs.length; i++)
		{
			if(map.containsKey(pairs[i].b) && pairs[i].a == map.get(pairs[i].b))
			{
				count++;		
			}	
			if(!map.containsKey(pairs[i].a))
			{
				map.put(pairs[i].a, pairs[i].b);
			}
		}
		return count;


	}

}
