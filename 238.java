class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];
        int prod = 1;
        answer[0] = prod;
        for (int i = 1; i < n; i++) {
            prod = prod * nums[i-1];
            answer[i] = prod;
        }
        prod = 1;
        for(int i=n-2;i>=0;i--){
            prod = prod * nums[i+1];
            answer[i] = answer[i] * prod;
        }
        return answer;
    }
}
