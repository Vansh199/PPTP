import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Question8 {
    public List<List<String>> printTree(TreeNode root) {
        // Calculate the height of the tree
        int height = getHeight(root);
        int rows = height + 1;
        int cols = (int) Math.pow(2, height) - 1;
        List<List<String>> res = new ArrayList<>();

        // Initialize the res matrix with empty strings
        for (int i = 0; i < rows; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add("");
            }
            res.add(row);
        }

        // Perform level-order traversal (BFS)
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<int[]> positions = new LinkedList<>();
        queue.offer(root);
        positions.offer(new int[] { 0, cols / 2 }); // Starting position for the root

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                int[] pos = positions.poll();
                int row = pos[0], col = pos[1];
                res.get(row).set(col, String.valueOf(node.val));

                if (node.left != null) {
                    queue.offer(node.left);
                    positions.offer(new int[] { row + 1, col - (int) Math.pow(2, height - row - 2) });
                }

                if (node.right != null) {
                    queue.offer(node.right);
                    positions.offer(new int[] { row + 1, col + (int) Math.pow(2, height - row - 2) });
                }
            }
        }

        return res;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
