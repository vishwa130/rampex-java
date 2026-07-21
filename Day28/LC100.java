package Day28;

public class LC100 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public boolean isSameTree(TreeNode p, TreeNode q) {

            if (p == null && q == null)
                return true;

            if (p == null || q == null)
                return false;

            if (p.val != q.val)
                return false;

            return isSameTree(p.left, q.left) &&
                   isSameTree(p.right, q.right);
        }
    }

    public static void main(String[] args) {

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Solution obj = new Solution();

        System.out.println(obj.isSameTree(p, q));
    }
}
