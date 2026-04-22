class Solution {
    public int search(int[] nums, int target) {
        int l = 0 ;
        int r = nums.length - 1 ;
        while(l <= r){
            if(nums[l] == target) return l ;
            if(nums[r] == target) return r ;

            if(nums[l] > target) return -1 ;
            else if(nums[r] < target) return -1 ;

            if(target - nums[l] <= nums[r]-target){
                l++;
            }else {
                r--;
            }
        }
        return -1;
    }
}
