package Day28;

import java.util.*;

public class LC144 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public List<Integer> preorderTraversal(TreeNode root) {

            List<Integer> ans = new ArrayList<>();
            preorder(root, ans);
            return ans;
        }

        private void preorder(TreeNode root, List<Integer> ans) {
            if (root == null)
                return;

            ans.add(root.val);
            preorder(root.left, ans);
            preorder(root.right, ans);
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution obj = new Solution();

        System.out.println(obj.preorderTraversal(root));
    }
}
