class Solution {
    public String stoneGameIII(int[] stoneValue) {
        Integer [] dp = new Integer [stoneValue.length];
        int maxAdv = curPlayerAdv(stoneValue,0,dp);
        if(maxAdv>0) return "Alice";
        if(maxAdv<0) return "Bob";
        else return "Tie";
        
    }
    private int curPlayerAdv(int[] nums, int idx, Integer[] dp){
        if (idx>=nums.length) return 0;
        if(dp[idx] != null) return dp[idx];
        int takeOne = nums[idx] - curPlayerAdv(nums, idx+1, dp);
        int takeTwo = Integer.MIN_VALUE;
        if (idx+1<nums.length) {
        takeTwo = nums[idx]+nums[idx+1] - curPlayerAdv(nums,idx+2, dp);
        }

        int takeThree = Integer.MIN_VALUE;
        if (idx + 2 < nums.length){
        takeThree = nums[idx] + nums[idx + 1] + nums[idx+2] - curPlayerAdv(nums,idx+3, dp);
        }
        return dp[idx] = Math.max(takeOne,Math.max(takeTwo,takeThree));
    }
}