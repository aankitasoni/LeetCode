/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
         Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        if(depth == 1){
            TreeNode temp = root;
            root = new TreeNode(val);
            root.left = temp;
            return root;
        }
        int currDepth = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            

            for (int i = 0; i < size; i++) {
                if (currDepth == depth - 1) {
                TreeNode newNodesLeft = null;
                TreeNode newNodesRight = null;
                if (q.peek().left != null) {
                    newNodesLeft = q.peek().left;

                }
                if (q.peek().right != null) {
                    newNodesRight = q.peek().right;
                }

                q.peek().left = new TreeNode(val);
                q.peek().right = new TreeNode(val);

                q.peek().left.left = newNodesLeft;
                q.peek().right.right = newNodesRight;
                

            }
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            currDepth++;
        }
        return root;
    }
}