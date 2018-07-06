
package Trees;
import java.util.*;
public class BinaryTree 
{
	public Node root;

	public BinaryTree()
	{
		this.root = null;
	}

	public BinaryTree(Object x)
	{
		this.root = new Node(x);
	}

	/*
	 * Inorder traversal.
	 */
	public void InorderTraversal(Node rootNode)
	{
		if(rootNode == null)
		{
			//System.out.print("NULL ");
			return;
		}
		//left subtree
		InorderTraversal(rootNode.left);
		
		//node
		System.out.print(rootNode.data + " ");
		
		//right subtree
		InorderTraversal(rootNode.right);
	}

	/*
	 * Preorder traversal.
	 */
	public void PreorderTraversal(Node rootNode)
	{
		if(rootNode == null)
		{
			//System.out.print("NULL ");
			return;
		}
		//node
		System.out.print(rootNode.data + " ");
		
		//left subtree
		PreorderTraversal(rootNode.left);
		
		//right subtree
		PreorderTraversal(rootNode.right);
	}
	
	/*
	 * Postorder traversal.
	 */
	public void PostorderTraversal(Node rootNode)
	{
		if(rootNode == null)
		{
			//System.out.print("NULL ");
			return;
		}
		
		//left subtree
		PostorderTraversal(rootNode.left);
		
		//right subtree
		PostorderTraversal(rootNode.right);
		
		//node
		System.out.print(rootNode.data + " ");
	}
	
	/*
	 * Level order traversal. 
	 * Time: O(n)
	 */
	public void levelOrderTraversal(Node rootNode)
	{
		System.out.print("Level Order Traversal of the tree: ");
		if(rootNode == null)
		{
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		Node tempNode = rootNode;
		while(tempNode != null)
		{
			System.out.print(tempNode.data + " ");
			queue.add(tempNode.left);
			queue.add(tempNode.right);
			tempNode = queue.remove();
		}
	}
	
	
	
	public void levelOrderTraversal2(Node rootNode)
	{
		if(rootNode == null)
		{
			return;
		}
		
		
	}

	public void printBothChildren(Node n)
	{
		System.out.print(n.left.data + " ");
		System.out.print(n.right.data + " ");	
	}
	
	public int height(Node rootNode)
	{
		if(rootNode == null)
		{
			return 0;
		} 
		int leftHeight =1+ height(rootNode.left);
		int rightHeight = 1+ height(rootNode.right);
		if(leftHeight > rightHeight)
		{
			return leftHeight;
		}
		else
		{
			return rightHeight;
		}		
		
	}
	
}
