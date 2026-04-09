class Solution {
    public boolean checkInclusion(String s1, String s2) {
        

        
        int windowSize = s1.length();
        Map<Character , Integer> map1 = new HashMap<>();
        
        for(char ch : s1.toCharArray()){
            map1.put(ch , map1.getOrDefault(ch,0)+1);
        }

        Map<Character , Integer> map2 = new HashMap<>();

        int left = 0 ;
        int right = 0;
        while(right < s2.length()){
            char ch = s2.charAt(right);
            map2.put(ch , map2.getOrDefault(ch,0)+1);

            if(right - left + 1 > windowSize){
            map2.put(s2.charAt(left), map2.get(s2.charAt(left))-1 );
            if(map2.get(s2.charAt(left)) == 0) map2.remove(s2.charAt(left));
            left++;
            }

            if(right - left + 1 == windowSize && map1.equals(map2)) return true;
            right++;
        }
    return false;
    }
}
