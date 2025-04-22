class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        String res = "";
        int max = 0;
        for (int i = 0; i < n; i++) {
            int current = 0;
            if (res.contains(String.valueOf(s.charAt(i)))) {
                int index = res.indexOf(s.charAt(i));
                res = res.substring(index+1);
            }
            res = res + String.valueOf(s.charAt(i));
            current = res.length();
            max = Math.max(current, max);
        }
        return max;
    }
}
