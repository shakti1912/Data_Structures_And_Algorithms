package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class isHappy {

	 public static boolean isHappy(int n) 
	    {
	        boolean done = false;
			Set<Integer> set = new HashSet<Integer>();
			//String s = String.valueOf(n);
			set.add(n);
			while(!done)
			{
				int temp = 0;
				String s = String.valueOf(n);
				
				for(int i=0; i < s.length(); i++)
				{
					temp = temp + Integer.parseInt(s.substring(i, i+1))*Integer.parseInt(s.substring(i, i+1));
					
				}
				if(temp == 1)
				{
					return true;
				}
				else if(set.contains(temp))
				{
					return false;
				}
				else
				{
					n = temp;
					temp = 0;
					//s = String.valueOf(n);
	                set.add(n);
				}

			}

			return false;	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
