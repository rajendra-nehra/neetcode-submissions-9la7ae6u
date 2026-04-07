class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength  = 0 ;
        
        for (int i = 0 ; i < s.length() ; i++){

            int arr[] = new int[26] ;
            int maxFreq = 0 ;
            for(int j = i ; j< s.length() ; j++){
                int lengthSubString = j - i + 1 ;
                char ch = s.charAt(j);
                arr[ch-'A']++;
                maxFreq = Math.max(maxFreq , arr[ch-'A']);
                int changesToMake = lengthSubString-maxFreq ;
                if(k >= changesToMake ){
                    maxLength = Math.max(maxLength , lengthSubString);
                }
                else break ;
            }
        }
        return maxLength ;
    }
}
