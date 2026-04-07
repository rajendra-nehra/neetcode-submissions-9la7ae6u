class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0 ;
        int ans = 1 ;
        int index = -1 ;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == 0) { 
                count++;
                index = i ;
            }
            else ans = ans*nums[i];
            if (count == 2) break;
        }
        if (count == 1) {
            result[index] = ans ;
            return result ;
         }
        if(count == 2) return result ;
        
        for(int i = 0 ; i < nums.length ; i++){
            result[i] = ans/nums[i];
        }
        return result ;
    }
}  
