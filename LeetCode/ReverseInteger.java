package LeetCode;

public class ReverseInteger 
{
	public static int reverse(int x)
	{
		String reverse = "";
		if (x > 0)
		{
			String s = String.valueOf(x);
			
			for(int i=s.length()-1; i >= 0; i--)
			{
				reverse = reverse + s.charAt(i);
			}
			
		}
		else if (x < 0)
		{
			String s = String.valueOf(x);
			for(int i=s.length()-1; i > 0; i--)
			{
				reverse = reverse + s.charAt(i);
			}
			reverse = "-" + reverse;
			
		}
		else
		{
			return 0;
		}
		try{
	        int ret = Integer.parseInt(reverse);
	            return ret;
	        }
	        catch (Exception e)
	        {
	            return 0;
	        }	
	}
	public static void main(String args[])
	{
		System.out.println(reverse(1646324359));
	}

}
