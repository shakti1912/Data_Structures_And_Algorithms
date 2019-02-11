package Arrays;

public class isMonotonic {


	public boolean isMonotonic(int[] A) {
		
		int decide = -1; // 0 = decreasing, 1 = increasing
		if(A[0] > A[A.length-1])
		{
			decide = 1; //increasing
		}
		else if(A[0] < A[A.length-1])
		{
			decide = 0; //decreasing
		}
		else
		{
			//all values are same in the array
		}
		for(int i=0 ;i  < A.length-1; i++)
		{
			if(decide == 1 && A[i] < A[i+1])
			{
				return false;
			}
			if(decide == 0 && A[i] > A[i+1])
			{
				return false;
			}
			if(decide == -1 && A[i] != A[i+1])
			{
				return false;
			}
		}
		return true;
	
	}

}
