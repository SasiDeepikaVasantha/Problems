class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, maxlen = 0;
        HashSet<Character> map = new HashSet<Character>();
        for (int right = 0; right < s.length(); right++) {
            while(map.contains(s.charAt(right))) {
                map.remove(s.charAt(left));
                left++;
            }
            map.add(s.charAt(right));
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}