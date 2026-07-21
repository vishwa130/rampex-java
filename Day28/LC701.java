package Day28;

public class LC701 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public TreeNode insertIntoBST(TreeNode root, int val) {

            if (root == null)
                return new TreeNode(val);

            if (val < root.val)
                root.left = insertIntoBST(root.left, val);
            else
                root.right = insertIntoBST(root.right, val);

            return root;
        }

        public void inorder(TreeNode root) {

            if (root == null)
                return;

            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Solution obj = new Solution();

        root = obj.insertIntoBST(root, 5);

        obj.inorder(root);
    }
}
