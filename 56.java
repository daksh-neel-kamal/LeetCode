class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int size = res.size();
            int[] resArray = res.get(size - 1);
            int endOfResArray = resArray[1];
            int startOfSecond = intervals[i][0];
            if (endOfResArray >= startOfSecond) {
                res.remove(size - 1);
                int[] temp = new int[2];
                temp[0] = resArray[0];
                temp[1] = Math.max(intervals[i][1], endOfResArray);
                res.add(temp);
            } else {
                res.add(intervals[i]);
            }
        }
        int[][] result = new int[res.size()][2];
        return res.toArray(result);
    }
}
