class Solution {
    public void moveZeroes(int[] nums) {
       /* int slow = 0;
        int p = nums.length;
        for(int i = 0 ; i<p; i++){
            if(nums[i] != 0){
                int result = nums[slow];
                nums[slow] = nums[i];
                nums[i] = result;
                slow++;
            }
        }
        //return slow;*/
        int i = 0;
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != 0){
                swap(nums , i , j);
                i++;
            }
        }
    }
        public void swap(int[] arr, int i , int j){
            arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
        }
        
    }
//}