class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length()) return false; 
        
        int windowSize = s1.length();
        int[] arr1 = new int[26];
        
        for(char ch : s1.toCharArray()){
            arr1[ch-'a']++;
        }

        int arr2[] = new int[26];

        int left = 0 ;
        int right = 0;
        while(right < s2.length()){
            char ch = s2.charAt(right);
            arr2[ch-'a']++;

            while(arr2[ch-'a'] > arr1[ch-'a']) {
            arr2[s2.charAt(left)-'a']--;
            left++;
            }

            if(right - left + 1 == windowSize && arr2[ch-'a'] == arr1[ch-'a']) return true;
            right++;
        }
    return false;
    }
}
