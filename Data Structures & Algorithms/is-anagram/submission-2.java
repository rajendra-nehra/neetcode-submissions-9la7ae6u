class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false ;
        //using array 
        int[] arr = new int[26] ;
        String s1 = s.toLowerCase();
        String t1 = t.toLowerCase();

        for(int i = 0 ; i < s.length() ; i++){
            int num1 = s1.charAt(i) - 'a' ;
            int num2 = t1.charAt(i) - 'a' ;
            
            arr[num1]++;
            arr[num2]--;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(arr[i] != 0 ) return false ;
        }
        return true;
    }
}
