import javax.swing.tree.TreeNode;

public class Question3 {
    int max=0;
    public int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        max=Math.max(max,left+right);
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return max;
    }
}
