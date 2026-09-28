class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowavg=0;
        double maxavg=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        windowavg=sum/k;
        maxavg=windowavg;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i];
            sum=sum-nums[i-k];
            windowavg=sum/k;
            maxavg=Math.max(maxavg,windowavg);
        }
    return maxavg;
    }
}