package Trees;

public class MinimumDistanceBetweenBSTNodes {

	public int minDiffInBST(BSTNode root)
	{
		int currentMin =  helper(root);
		//left handle
		BSTNode currentLeft = root.left;
		while(currentLeft != null)
		{
			int temp = helper(currentLeft);
			if(temp < currentMin)
			{
				currentMin = temp;
			}
			currentLeft = currentLeft.left;
		}
		
		//left handle
				BSTNode currentRight = root.right;
				while(currentRight != null)
				{
					int temp = helper(currentRight);
					if(temp < currentMin)
					{
						currentMin = temp;
					}
					currentRight = currentRight.right;
				}
		
		return currentMin;
	}
	public int helper(BSTNode root)
	{
		int minLeft = Integer.MAX_VALUE ;
		int minRight = Integer.MAX_VALUE;
        int currentMin  =  Integer.MAX_VALUE;
		
        
        if(root.left != null && root.right == null)
			{
				minLeft = (int)root.data - (int)root.left.data; 
            return minLeft;
			}
        if(root.right != null && root.left == null)
			{
				minRight =  (int)root.right.data - (int)root.data; 
            return minRight;
			} 
        if(root.right == null && root.left == null)
        {
            return Integer.MAX_VALUE;
        }
        if(root.right != null && root.left != null)
        {
                minLeft = (int)root.data - (int)root.left.data; 
            minRight =  (int)root.right.data - (int) root.data; 
            currentMin = minRight - minLeft;
            
        }
        return currentMin;
			
			
		}
		

}
