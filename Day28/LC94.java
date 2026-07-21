package Day28;

import java.util.*;

public class LC94 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public List<Integer> inorderTraversal(TreeNode root) {

            List<Integer> ans = new ArrayList<>();
            inorder(root, ans);
            return ans;
        }

        private void inorder(TreeNode root, List<Integer> ans) {
            if (root == null)
                return;

            inorder(root.left, ans);
            ans.add(root.val);
            inorder(root.right, ans);
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution obj = new Solution();

        System.out.println(obj.inorderTraversal(root));
    }
}
