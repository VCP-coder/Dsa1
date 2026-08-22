class Solution {
    private int wave(int x){
        String s=Integer.toString(x);
        int count=0;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i-1) && s.charAt(i)>s.charAt(i+1) || s.charAt(i)<s.charAt(i-1) && s.charAt(i)<s.charAt(i+1)){
                count++;
            }
        }
    return count;
    }
    public int totalWaviness(int num1, int num2) {
        int res=0;
        for(int i=num1;i<=num2;i++){
            res+=wave(i);
        }
    return res;
    }
}