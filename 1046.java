class Solution {
    public int lastStoneWeight(int[] stones) {

        if (stones.length == 0) {
            return 0;
        } else if (stones.length == 1) {
            return stones[0];
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            q.add(stones[i]);
        }
        while (q.size() > 1) {
            int max = q.remove();
            int secondMax = q.remove();
            int diff = max - secondMax;
            q.add(diff);
        }
        if (q.size() == 1) {
            return q.remove();
        }
        return 0;
    }
}
