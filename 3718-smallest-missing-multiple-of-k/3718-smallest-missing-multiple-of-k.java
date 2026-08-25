class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        int res=k;
        while(hs.contains(res)){
            res+=k;
        }
    return res;
    }
}