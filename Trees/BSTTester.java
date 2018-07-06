package Trees;

public class BSTTester 
{	
	public static void main(String[] args)
	{
		searchTester();
		BinarySearchTree tree = tree();
		BSTNode min = tree.minimum(tree.root);
		System.out.println("Minimum node in the tree : "  + min.data);
		BSTNode max = tree.maximum(tree.root);
		System.out.println("Maximum node in the tree : "  + max.data);
		BSTNode n = tree.insert(9);
		tree.insert(4);
		tree.insertRecursive(tree.root,1);
		tree.delete(n);
		tree.inorderTraversal(tree.root);

	}

	public static void searchTester(){

		BinarySearchTree bst = tree();
		try
		{
			System.out.print("Search 8 recursively: ");
			BSTNode searched = bst.search(bst.root, 8);
			System.out.println("found " + searched.data);
			System.out.print("Search 1 iteratively: ");
			BSTNode searchedIterative = bst.searchIterative(bst.root, 1);	
			System.out.println("found " + searchedIterative.data);

		}
		catch (Exception e)
		{
			System.out.println("No Such element found");
		}	
	}

	public static BinarySearchTree tree()
	{
		BinarySearchTree bst = new BinarySearchTree();
		bst.root = new BSTNode(5);
		bst.root.left = new BSTNode(3);
		bst.root.right = new BSTNode(7);
		bst.root.left.left = new BSTNode(2);
		bst.root.left.right = new BSTNode(5);
		bst.root.right.right = new BSTNode(8);
		return bst;
	}

}
