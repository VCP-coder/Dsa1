class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int val=Math.abs((int)s.charAt(i)-123);
            res+=val*(i+1);
        }
    return res;
    }
}