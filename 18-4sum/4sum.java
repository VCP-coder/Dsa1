class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       Arrays.sort(nums);
       Set<List<Integer>> ans=new HashSet<>();
       for(int i=0;i<nums.length-3;i++){
        for(int j=i+1;j<nums.length-2;j++){
            int left=j+1;
            int k=nums.length-1;
            while(left<k){
            long sum=(long)nums[i]+nums[j]+nums[left]+nums[k];
            if(sum==target){
                ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[k]));
                left++;
                k--;
            }
            else if(sum<target){
                left++;
            }
            else{
                k--;
            }
            }
        }
       } 
    return new ArrayList<>(ans);
    }
}