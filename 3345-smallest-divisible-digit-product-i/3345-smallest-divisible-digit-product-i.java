class Solution {
    private int productDigit(int num){
        int product=1;
        while(num>0){
            product*=num%10;
            num=num/10;
        }
    return product;
    }
    public int smallestNumber(int n, int t) {
        while(productDigit(n)%t!=0){
            n++;
        }
    return n;
    }
}