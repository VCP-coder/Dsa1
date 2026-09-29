class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        long window_sum=0;
        long max_sum=0;
        for(int i=0;i<k;i++){
            window_sum+=nums[i];
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        if(mp.size()==k){
            max_sum=Math.max(max_sum,window_sum);
        }

        for(int i=k;i<n;i++){
            window_sum+=nums[i]-nums[i-k];
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

            mp.put(nums[i-k],mp.get(nums[i-k])-1);

            if(mp.get(nums[i-k])==0){
                mp.remove(nums[i-k]);
            }
            if(mp.size()==k){
                max_sum=Math.max(max_sum,window_sum);
            }
        }
    return max_sum;
    }
}