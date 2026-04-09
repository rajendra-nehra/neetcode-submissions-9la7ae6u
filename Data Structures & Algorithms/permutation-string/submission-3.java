class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length() ) return false ;

        Map <Character , Integer > map1  = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map1.put(ch , map1.getOrDefault(ch , 0)+1);
        }
        int requiredCharMatch  = map1.size();
        
        Map <Character , Integer > map2 = new HashMap<>();
        
        int matches = 0 ;   
        int left = 0 ;
        for (int right = 0 ; right < s2.length() ; right++){
            char ch = s2.charAt(right);
            map2.put(ch , map2.getOrDefault(ch , 0)+1);

            if(map1.containsKey(ch) && map1.get(ch).equals(map2.get(ch))) matches++;

            if(right - left + 1 > s1.length()){
                char leftChar = s2.charAt(left);

                if(map1.containsKey(leftChar) && map1.get(leftChar).equals(map2.get(leftChar))) matches--;

                map2.put(leftChar , map2.get(leftChar)-1);

                if(map2.get(leftChar) == 0) map2.remove(leftChar);

                left++;
            }

            if(matches == requiredCharMatch) return true ;
        }
        return false; 
    }
}
