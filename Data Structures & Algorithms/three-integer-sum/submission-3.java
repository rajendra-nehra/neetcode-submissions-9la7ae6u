class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0 ; i < nums.length-2 ; i++){
            int target  = -nums[i];
            HashMap<Integer , Integer > map = new HashMap<>();

            for(int j = i+1 ; j < nums.length ; j++){
                if(map.containsKey(target-nums[j])){
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[j]);
                    subList.add((target-nums[j]));
                    Collections.sort(subList);
                    set.add(subList);
                }
                map.put(nums[j], j);
            }
        }
        List<List<Integer>> result = new ArrayList<>(set);
        Collections.sort(result, (a, b) -> {
    for (int i = 0; i < 3; i++) {
        if (!a.get(i).equals(b.get(i))) {
            return a.get(i) - b.get(i);
        }
    }
    return 0;
});
        return result ;
    }
}
