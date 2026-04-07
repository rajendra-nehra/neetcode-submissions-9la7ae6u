class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] prefixMult = new int[size] ;
        int[] suffixMult = new int[size] ;
        prefixMult[0] =nums[0] ;
        suffixMult[size-1] =nums[size-1] ;
        int[] result = new int[size];
        for(int i  = 1 ; i < size ; i++){
            prefixMult[i] = prefixMult[i-1]*nums[i];
        }
        for(int i  = size-2 ; i >=0 ; i--){
            suffixMult[i] = suffixMult[i+1]*nums[i];
        }
        result[0] = suffixMult[1];
        result[size-1] = prefixMult[size-2];
        for(int i = 1 ; i< size-1 ; i++){
            result[i] = prefixMult[i-1]*suffixMult[i+1];
        }
        return result;
    }
}  
