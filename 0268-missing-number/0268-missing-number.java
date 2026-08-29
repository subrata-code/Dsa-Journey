class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        double curSum = 0;

        double actualSum = (n*(n+1))/2;

        for(int i = 0 ; i < n ; i++ ){

            curSum += nums[i];
            //double ans = curSum - actualSum;

      
        }
        double ans = actualSum - curSum;
        return (int)ans;
        
        
    }
}