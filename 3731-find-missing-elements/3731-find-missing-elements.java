class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
            hs.add(num);
        }
    ArrayList<Integer> res=new ArrayList<>();
    for(int i=min;i<=max;i++){
        if(!hs.contains(i)){
            res.add(i);
        }
    }
    return res;
    }
}