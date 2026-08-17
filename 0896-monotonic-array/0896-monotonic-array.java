class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<=nums.length-2;i++){
            if(nums[i+1]<nums[i]){
                inc=false;
            }
            else if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                dec=false;
            }
        }
    return inc||dec;
    }
}