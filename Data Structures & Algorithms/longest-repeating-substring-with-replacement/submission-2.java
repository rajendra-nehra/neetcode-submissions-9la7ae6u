class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character ,Integer> map = new HashMap<>();
        int maxLength = 0 ;
        int left = 0 ;
        int right = 0 ;
        int maxFreq = 0 ;
        while(right < s.length()){
            int windowSize = right - left + 1 ;
            char ch = s.charAt(right);
            map.put(ch , map.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq , map.get(ch));
            if(k >= windowSize - maxFreq){
                maxLength = Math.max(maxLength , windowSize);
            }else{
                char removeCh = s.charAt(left);
                map.put(removeCh , map.get(removeCh)-1);
                left++;
            }
            right++;
        }
        return maxLength ;
    }
}
