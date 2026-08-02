class Solution {
    public boolean stoneGame(int[] piles) {
        Integer[][] dp = new Integer[piles.length][piles.length];
        int maximumAdv = curPlayerNetAdv(piles,0,piles.length-1,dp);
        if (maximumAdv>0) return true;
        else return false;
        
    }
    private int curPlayerNetAdv(int[] nums,int left, int right, Integer[][] dp){
        if(left == right) return nums[left];

        if(dp[left][right]!=null) return dp[left][right];
        int chooseLeft = nums[left] - curPlayerNetAdv(nums,left+1,right,dp);
        int chooseRight = nums[right] - curPlayerNetAdv(nums,left,right-1,dp);
        return dp[left][right] = Math.max (chooseLeft,chooseRight);
    }
}