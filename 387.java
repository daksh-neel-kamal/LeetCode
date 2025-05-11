class Solution {
    public int firstUniqChar(String s) {

        Map<Character, Integer> m = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (m.containsKey(c)) {
                int count = m.get(c);
                m.put(c, ++count);
            } else {
                m.put(c, 1);
            }
        }
        int res = -1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (m.get(c) == 1) {
                res = i;
                break;
            }
        }
        return res;
    }
}
