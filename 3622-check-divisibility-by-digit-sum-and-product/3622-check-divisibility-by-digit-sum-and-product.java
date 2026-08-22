class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int original=n;
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n=n/10;
        }
    return original%(product+sum)==0;
    }
}