package Day27;

import java.util.*;

public class LC46 {

    static class Solution {

        public List<List<Integer>> permute(int[] nums) {

            List<List<Integer>> ans = new ArrayList<>();
            backtrack(nums, new ArrayList<>(), new boolean[nums.length], ans);
            return ans;
        }

        private void backtrack(int[] nums, List<Integer> temp,
                               boolean[] used, List<List<Integer>> ans) {

            if (temp.size() == nums.length) {
                ans.add(new ArrayList<>(temp));
                return;
            }

            for (int i = 0; i < nums.length; i++) {

                if (used[i])
                    continue;

                used[i] = true;
                temp.add(nums[i]);

                backtrack(nums, temp, used, ans);

                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 3};

        System.out.println(obj.permute(nums));
    }
}
