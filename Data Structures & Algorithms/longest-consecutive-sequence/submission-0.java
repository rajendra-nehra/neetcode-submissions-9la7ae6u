class Solution {
    public int longestConsecutive(int[] nums) {
        Set < Integer > set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxSeq = 0 ;
        for(int num: set){
            if(!set.contains(num-1)){
                int count = 1 ;
                while(set.contains(++num)){
                    count++;
                    
                }
                maxSeq = Math.max(maxSeq , count);
            }
        }
        return maxSeq ;
    }
}
