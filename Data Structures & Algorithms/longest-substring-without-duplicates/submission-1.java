class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 ;
        int right = 0 ;
        int maxLength = 0 ;
        HashMap<Character ,Integer> map = new HashMap<>(); 
        while(right < s.length()){
            char ch = s.charAt(right);
            if(map.containsKey(ch) && map.get(ch) >= left){
                left = map.get(ch)+1 ;
            }
            map.put(ch , right);
            int windowSize = right - left +1 ;
            maxLength = Math.max(windowSize , maxLength);
            right++;
        }
        return maxLength;
    }
}
