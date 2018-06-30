package Hashing.General_Problems;
import java.util.ArrayList;
import java.util.HashSet;

public class FindMissing 
{
	public  ArrayList<Integer> missing(int[] a, int low, int high)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i <a.length; i++)
		{
			set.add(a[i]);
		}
		for(int i = low; i <= high; i++)
		{
			if(!set.contains(i))
			{
				list.add(i);
			}
		}
		return list;
	}
	
	public ArrayList<Integer> missing2(int[] a, int low, int high)
	{
		//need to finish this.
		return new ArrayList<Integer>();
	}

}
