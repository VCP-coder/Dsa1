class Solution {
    public int countCommas(int n) {
        int count=0;
       for(int i=n;i>=1000;i-- ) {
           count++;
       }
    return count;
    }
}