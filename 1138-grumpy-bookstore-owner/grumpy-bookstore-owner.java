class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                satisfied+=customers[i];
            }
        }
        int currunsatisfied=0;
        int max=0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                currunsatisfied+=customers[i];
            }
        }
        max=currunsatisfied;
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i]==1){
                currunsatisfied+=customers[i];
            }
            if(grumpy[i-minutes]==1){
                currunsatisfied-=customers[i-minutes];
            }
            max=Math.max(max,currunsatisfied);
        }
    return max+satisfied;
    }
}