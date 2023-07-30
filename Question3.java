import javax.swing.tree.TreeNode;

public class Question3 {
     private int minDiff;
    private Integer prevValue;
      private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        
        // Traverse left subtree
        inOrderTraversal(root.left);
        
        // Process current node
        if (prevValue != null) {
            minDiff = Math.min(minDiff, Math.abs(root.val - prevValue));
        }
        prevValue = root.val;
        
        // Traverse right subtree
        inOrderTraversal(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        minDiff = Integer.MAX_VALUE;
        prevValue = null;
        inOrderTraversal(root);
        return minDiff;
    }
}
