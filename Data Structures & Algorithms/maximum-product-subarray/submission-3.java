class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            int min = minProd ;
            int max = maxProd ;
            maxProd = Math.max(Math.max(nums[i] , max*nums[i]) , min*nums[i]);
            minProd = Math.min((Math.min(nums[i] , max*nums[i])) , min*nums[i]);
            ans = Math.max(ans , maxProd);
System.out.println("max = " + maxProd + " + min = " + minProd + " + ans = " + ans);        }
        return ans ;
    }
}
