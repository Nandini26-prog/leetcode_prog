class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is symmetric
        }
        return isSymmetricHelper(root.left, root.right); // Start recursion
    }

    private boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        // If both nodes are null, they are symmetric
        if (left == null && right == null) {
            return true;
        }
        // If one of the nodes is null, they are not symmetric
        if (left == null || right == null) {
            return false;
        }
        // Check if the values are equal
        if (left.val != right.val) {
            return false;
        }
        // Recur for the left child of left and right child of right,
        // and the right child of left and left child of right
        return isSymmetricHelper(left.left, right.right) && 
               isSymmetricHelper(left.right, right.left);
    }
}
