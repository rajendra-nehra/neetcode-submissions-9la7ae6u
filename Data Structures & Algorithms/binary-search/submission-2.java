class Solution {
    public int search(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length - 1 ;
        while(left <= right ){
            int mid = left + (right - left )/2 ;
            int value = nums[mid]; 
            if(value == target) return mid ;
            if(value > target) right = mid-1 ;
            else left = mid+1 ;
        }
        return -1 ;
    }
}
