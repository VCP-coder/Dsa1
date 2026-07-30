class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
            int rev=0;
            while(num>0){
                rev=rev*10+num%10;
                num=num/10;
            }
            hs.add(rev);
        }
    return hs.size();
    }
}