package Trees;

   class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class LCA_of_BST {


       /*
       Time Complexity: O(n)
       Space Complexity: O(n)
        */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode current = root;
        if (current.val < p.val && current.val < q.val) {
            return lowestCommonAncestor(current.right, p, q);
        } else if (current.val > p.val && current.val > q.val) {
            return lowestCommonAncestor(current.left, p, q);
        } else {
            return current;
        }
    }

}