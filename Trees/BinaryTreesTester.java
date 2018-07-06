package Trees;

public class BinaryTreesTester 
{

	public static void main(String args[])
	{
		/* creating a binary tree and entering the nodes */
		//Node root = new Node(1);
		BinaryTree tree = new BinaryTree(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		//tree.root.left.left = new Node(4);
		//tree.root.left.right = new Node(5);
		//tree.root.left.right.left = new Node(6);
		//tree.root.left.right.right = new Node(7);

		//tree.root.right.left = new Node(6);
		//tree.InorderTraversal(tree.root);

		//tree.PreorderTraversal(tree.root);

		//tree.PostorderTraversal(tree.root);
		//tree.levelOrderTraversal(tree.root);

		int height = tree.height(tree.root);
		System.out.println(height);

		//InOrderTraversalWithoutRecursion inOrder = new InOrderTraversalWithoutRecursion(tree.root);
		//inOrder.traversal();
		
	//	DiameterOfBT dia = new DiameterOfBT(tree.root);
		//int diameter = dia.diameter(tree.root);
		//System.out.print(diameter);

	}
	
	//this is not correct.
	public static void threadedBinaryTreeTester()
	{
		ThreadedBinaryTree TBT = new ThreadedBinaryTree(6);
		TBT.root.left = new ThreadedNode(3);
		TBT.root.right = new ThreadedNode(8);
		TBT.root.left.left = new ThreadedNode(1);
		TBT.root.left.left.right = TBT.root.left;
		TBT.root.left.left.rightThread = true;
		TBT.root.left.right = new ThreadedNode(5);
		TBT.root.left.right.right = TBT.root;
		TBT.root.left.right.rightThread = true;
		TBT.root.right.left = new ThreadedNode(7);
		TBT.root.right.left.right = TBT.root.right;
		TBT.root.right.left.rightThread = true;
		TBT.root.right.right = new ThreadedNode(11);
		TBT.root.right.right.left = new ThreadedNode(9);
		TBT.root.right.right.left.right = TBT.root.right.right;
		TBT.root.right.right.left.rightThread = true;
		TBT.root.right.right.right = new ThreadedNode(13);
		TBT.inOrder();
	}	
}

