class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false ;

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char addCh = s.charAt(i);
            char removeCh = t.charAt(i);
            map.put( addCh , map.getOrDefault(addCh , 0)+1);
            map.put( removeCh , map.getOrDefault(removeCh , 0)-1);
        }
        for(Map.Entry<Character , Integer> entry: map.entrySet()){
            if(entry.getValue() != 0 ) return false ;
        }
        return true ;
    }
}
