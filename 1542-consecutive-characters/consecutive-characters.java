class Solution {
    public int maxPower(String s) {
        int res=0;
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                res=Math.max(res,count);
            }
            else{
                count=0;
            }
        }
    return 1+res;
    }
}