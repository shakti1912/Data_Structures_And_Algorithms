package Trees;

class ThreadedNode
	{
		Object data;
		ThreadedNode left, right;
		boolean rightThread;

		public ThreadedNode(Object x)
		{
			data = x;
			left = right = null;
			rightThread = false;
		}
	}