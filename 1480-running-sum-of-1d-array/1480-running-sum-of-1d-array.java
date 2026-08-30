class Solution {
    public int[] runningSum(int[] nums) {
        //int[] ps = new int[nums.length]
        
        int n = nums.length;
        //ps[0] = nums[0];

        for(int i = 1; i<n ; i++){
            nums[i] = nums[i-1] + nums[i]; 
        }
        return nums;
    }
}