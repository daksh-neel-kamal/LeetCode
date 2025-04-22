class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        if (k > n) {
            k = k % n;
        }
        nums = reverse(nums, 0, n-1);
        nums = reverse(nums, 0, k-1);
        nums = reverse(nums, k, n-1);
    }

    private int[] reverse(int[] nums, int s, int e){

        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
        return nums;
    }
}
