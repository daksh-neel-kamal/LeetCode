class Solution {
    public int countSubstrings(String s) {
        
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++){
            count = count + expand(s, n, i, i);
            count = count + expand(s, n, i, i+1); 
        }
        return count;
    }

    private int expand(String s, int n, int l, int r){

        int count = 0;
        while(l>=0 && r < n){
            if(s.charAt(l) == s.charAt(r)){
                count++;
            } else {
                break;
            }
            l--;
            r++;
        }
        return count;
    }
}
