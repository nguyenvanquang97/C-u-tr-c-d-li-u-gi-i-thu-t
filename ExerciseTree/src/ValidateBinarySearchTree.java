public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        TreeNode min = null;
        TreeNode max = null;
        return isValidBSTHelper(root, min, max);
    }

    public boolean isValidBSTHelper(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.val <= min.val) {
            return false;
        }
        if (max != null && root.val >= max.val) {
            return false;
        }
        return isValidBSTHelper(root.left, min, root) && isValidBSTHelper(root.right, root, max);
    }
}
