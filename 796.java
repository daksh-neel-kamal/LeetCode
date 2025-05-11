class Solution {
    public boolean rotateString(String s, String goal) {

        int n = s.length();
        if(n != goal.length()){
            return false;
        }
        int start = 0;
        int end = n - 1;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(0);
            s = s + String.valueOf(c);
            s = s.substring(1);
            if (s.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
