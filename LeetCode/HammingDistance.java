package LeetCode;

public class HammingDistance
{

	public static int hammingDistance(int x, int y)
	{    
		boolean done = false;
		int dist = 0;
		//int t = ((x >> 1) ^ (y >> 1));
		//  System.out.println(t);
		while(x > 0 || y > 0)
		{ 
			int x_and = x & 1;
			int y_and = y & 1;
			if(x_and != y_and)
			{
				dist++;
			}
			
			
			x = x >> 1;
			y = y >> 1;
//			System.out.println("x_and " + x_and);
//			System.out.println("y_and " + y_and);
//			System.out.println("x " + x);
//			System.out.println("y " + y);
		}
		return dist;

	}
	  public static int hammingWeight(long n) {
	        int num_Ones = 0;
	        while(n > 0)
	        {
	            long n_and = n & 1;
	            if(n_and == 1)
	            {
	                num_Ones++;
	            }
	            n = n >> 1;
	        }
	        return num_Ones;
	        
	    }
	
	  public static int totalHammingDistance(int[] nums)
	  {
//		  int total = 0;
//		  //pairs 
//		  for(int i=0; i < nums.length; i++)
//		  {
//			  for(int j=i+1; j < nums.length; j++)
//			  {
//				// each pair find hamming distance
//				  total += hammingDistance(nums[i], nums[j]);
//				  
//			  }
//			  
//		  }
//		  return total;
		  int size = nums.length;
	        if(size < 2) return 0;
	        int ans = 0;
	        int[] zeroOne = new int[2];
	        while(true)
	        {
	            int zeroCount = 0;
	            zeroOne[0] = 0;
	            zeroOne[1] = 0;
	            for(int i = 0; i < nums.length; i++)
	            {
	                if(nums[i] == 0) zeroCount++;
	                zeroOne[nums[i] % 2]++;
	                nums[i] = nums[i] >> 1;
	            }
	            ans += zeroOne[0] * zeroOne[1];
	            if(zeroCount == nums.length) return ans;
	        }
	    }

	public static void main(String args[])
	{
		int[] nums = {4,14,2};
		System.out.println(totalHammingDistance(nums));
		
		//long i = 2147483648;
		//System.out.println(hammingWeight(i));
	}

}