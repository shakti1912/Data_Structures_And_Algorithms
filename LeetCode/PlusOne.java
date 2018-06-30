package LeetCode;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		boolean done = false;
		int index = digits.length-1;
		int[] ret = new int[index+2];
		ret[0] = 0;
		if(digits[0] == 9)
		{
			for(int i=0; i<digits.length; i++)
			{
				ret[i+1] = digits[i];
			}
		}
		else
		{
			ret = digits;
		}
		int ind = ret.length -1;
		while(!done && ind >= 0)
		{
			if(ret[ind] == 9)
			{
				ret[ind] = 0;
				ind--;       
			}
			else
			{
				ret[ind] = ret[ind] + 1;
				done = true;
			}
		}
		if (ret[0] == 0)
		{
			int[] r = new int[ret.length - 1];
			for(int m = 0; m < ret.length-1; m++)
			{
				r[m] = ret[m+1];
			}
			return r;

		}
		return ret;

	}
}
