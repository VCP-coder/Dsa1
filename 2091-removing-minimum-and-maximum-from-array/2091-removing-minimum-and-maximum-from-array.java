class Solution {
    public int minimumDeletions(int[] nums) {
        int max_index=0;
        int min_index=0;
        int max_num=Integer.MIN_VALUE;
        int min_num=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max_num){
                max_num=nums[i];
                max_index=i;
            }
            if(nums[i]<min_num){
                min_num=nums[i];
                min_index=i;
            }
        }
        int right= Math.max(max_index,min_index);
        int left=Math.min(max_index,min_index);
        int n=nums.length;
        return Math.min(right+1,Math.min(n-left,(left+1)+(n-right)));
    }
}