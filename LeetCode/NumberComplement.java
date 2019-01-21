package LeetCode;

public class NumberComplement {
	public static void main(String args[])
	{
		System.out.println(findComplement(2));
	}

	 public static int findComplement(int num)
	    {
	        String binary = "";
	        while(num > 0)
	        {
	            if ((num & 1) == 0)
	            {
	                binary = "1" + binary;
	            }
	            else
	            {
	            	binary = "0" + binary;
	            }
	            num = num >> 1;
	            
	        }
	        System.out.println(binary);
	        
	        Integer i = Integer.parseInt(binary,2);
	        return i;
	    }
}
