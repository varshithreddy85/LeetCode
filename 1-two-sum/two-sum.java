class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dict = new HashMap<>();

        int n = nums.length;

        for(int i = 0; i < n; i++){
            int x = target - nums[i];

            if(dict.containsKey(x)){
                return new int[]{i , dict.get(x)};
            }
            else{
                dict.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}