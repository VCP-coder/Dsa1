class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        long count=0;
        for(long start=1000;start<=n;start*=1000){
            count+=n-start+1;
        }
    return count;

    }
}