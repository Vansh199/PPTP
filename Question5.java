import javax.swing.tree.TreeNode;

public class Question5 {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        // Perform Morris Traversal to find the incorrect nodes
        morrisTraversal(root);

        // Swap the values of the incorrect nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void morrisTraversal(TreeNode root) {
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left == null) {
                // Process the current node
                if (prev.val > curr.val) {
                    if (first == null) {
                        first = prev;
                    }
                    second = curr;
                }
                prev = curr;

                curr = curr.right;
            } else {
                // Find the rightmost node of the left subtree
                TreeNode pre = curr.left;
                while (pre.right != null && pre.right != curr) {
                    pre = pre.right;
                }

                if (pre.right == null) {
                    // Thread the rightmost node to the current node
                    pre.right = curr;
                    curr = curr.left;
                } else {
                    // Revert the threaded link
                    pre.right = null;

                    // Process the current node
                    if (prev.val > curr.val) {
                        if (first == null) {
                            first = prev;
                        }
                        second = curr;
                    }
                    prev = curr;

                    curr = curr.right;
                }
            }
        }
}
