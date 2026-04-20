class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((long) nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);

                        ans.add(triplet);
                    
                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>(ans);
        Collections.sort(result, (a, b) -> {
    for (int i = 0; i < 3; i++) {
        if (!a.get(i).equals(b.get(i))) {
            return a.get(i) - b.get(i);
        }
    }
    return 0;
});
        return result;

    }
}
