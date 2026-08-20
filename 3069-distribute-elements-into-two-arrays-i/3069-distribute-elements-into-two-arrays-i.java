class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        al1.add(nums[0]);
        al2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(al1.get(al1.size()-1)>al2.get(al2.size()-1)){
                al1.add(nums[i]);
            }
            else{
                al2.add(nums[i]);
            }
        }
        int res[]=new int[nums.length];
        int index=0;
        for(int num:al1){
            res[index++]=num;
        }
        for(int num:al2){
            res[index++]=num;
        }
    return res;
    }
}