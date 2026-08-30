class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int result:nums){
            if(seen.contains(result)) return true;
            seen.add(result);
        } 
        return false;
    }
}