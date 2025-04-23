class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> freq = new HashMap<>();
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            String str = strs[i];
            Map<Character, Integer> count = new TreeMap<>();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(count.containsKey(c)){
                    count.put(c, count.get(c) + 1);
                } else {
                    count.put(c, 1);
                }
            }
            String countString = count.toString();
            if(freq.containsKey(countString)){
                List<String> temp = freq.get(countString);
                temp.add(str);
                freq.put(countString, temp);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                freq.put(countString, temp);
            }
        }
        for(Map.Entry<String, List<String>> map: freq.entrySet()){
            res.add(map.getValue());
        }
        return res;
    }
}
