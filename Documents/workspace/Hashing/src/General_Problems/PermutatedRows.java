package General_Problems;
import java.util.ArrayList;
import java.util.HashSet;

public class PermutatedRows
{
	public ArrayList<Integer> permuted(int[][] a, int row)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0 ; i < a[row].length; i++)
		{
			set.add(a[row][i]);
		}
		A: for(int i = 0 ; i < a.length; i++)
		{
			// this if could be avoided if we remove row element from the list.
			if( i == row)
			{
				continue A;
			}		
			int j = 0;
			B: for(j = 0; j < a[i].length; j++)
			{
				if(!set.contains(a[i][j]))
				{
					break B;
				}
			}
			if(j == a[i].length)
			{
				list.add(i);
			}	
		}
		/*
		Integer in = new Integer(row);
		list.remove(in);
		*/ 
		return list;
	}

}
