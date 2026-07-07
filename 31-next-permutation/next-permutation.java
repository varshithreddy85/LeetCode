class Solution {
    public void nextPermutation(int[] nums) {
        int p  = -1;
        int n = nums.length;
        int sw = nums[n-1];

        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                p = i;
                break;
            }
        }

        if(p == -1){
            reverse(nums, 0, n-1);
            return;
        }

        for(int i = n-1; i > p; i--){
            if(nums[i] > nums[p]){ 
                swap(nums, p, i);
                break;
            }
        }
        reverse(nums, p+1, n-1);
    }
    
    private void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}