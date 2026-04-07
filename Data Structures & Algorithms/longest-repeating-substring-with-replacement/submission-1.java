class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26] ;
        int maxLength = 0 ;
        int left = 0 ;
        int right = 0 ;
        int maxFreq = 0 ;
        while(right < s.length()){
            int windowSize = right - left + 1 ;
            char ch = s.charAt(right);
            arr[ch-'A']++;
            maxFreq = Math.max(maxFreq , arr[ch-'A']);
            if(k >= windowSize - maxFreq){
                maxLength = Math.max(maxLength , windowSize);
            }else{
                arr[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return maxLength ;
    }
}
