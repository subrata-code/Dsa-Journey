class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int freq = 0;
        int result = 0;
        for(int i = 0 ; i < n ; i++){
            //result = nums[i];
            if(freq == 0){
                result = nums[i];

            }
            if(result == nums[i]){
                freq ++;
            }else freq --;
        }
        return result;
        
    }
}