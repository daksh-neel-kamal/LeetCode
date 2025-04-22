class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        Set<Integer> numList = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numList.add(nums[i]);
        }
        int max = 0;
        for (Integer num : numList) {
            if (numList.contains(num - 1)) {
                continue;
            }
            int curr = 0;
            while (numList.contains(num)) {
                curr++;
                num++;
            }
            max = Math.max(curr, max);
        }
        return max;
    }
}
