class Solution {
    public int findKthLargest(int[] nums, int k) {

        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            q.add(nums[i]);
        }
        System.out.println(q);
        for(int i=1;i<k;i++){
            q.remove();
        }
        return q.remove();
    }
}
