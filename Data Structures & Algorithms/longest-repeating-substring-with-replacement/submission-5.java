class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character , Integer > map = new HashMap<>();

        int left = 0 ; 
        int right = 0 ;
        int maxOccurance = 0 ;
        int result = 0 ;
        while(right < s.length()){
            char ch = s.charAt(right);
            map.put(ch , map.getOrDefault(ch , 0)+1);
            
            maxOccurance = Math.max(map.get(ch),maxOccurance);
            if(k >= (right-left+1)-maxOccurance){
                result = Math.max(result , right-left+1);
            }else{
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
                }
            right++;
        }
    return result;
    }
}
