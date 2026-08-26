class Solution {
    public int pivotIndex(int[] arr) {
        int r = 0 ;
        for(int ele: arr){//int i= 0 ; i<arr.length; i++){
            //int ele = arr[i];
            r += ele;
        }
        int l = 0;
        for(int i = 0 ; i< arr.length; i++){
            r -= arr[i];
            if(r == l){
                return i;
            }
            l+=arr[i];

        }
        return -1;
        
        
    }
}