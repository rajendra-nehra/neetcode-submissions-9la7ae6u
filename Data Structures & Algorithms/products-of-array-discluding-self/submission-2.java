class Solution {
    public int[] productExceptSelf(int[] nums) {
       int size = nums.length;
       int[] res = new int[size] ;
       res[0] = 1 ;
       for(int i = 1 ; i < size ; i++){
        res[i] = res[i-1] * nums[i-1];
       }
       int suffix = nums[size-1];
       for(int i = size-2 ; i>=0 ; i--){
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res ;
    }
}
