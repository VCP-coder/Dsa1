class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
         
           int val=(int)s.charAt(i);
           int fval=Math.abs(val-123);
           ans=ans+fval*(i+1);
        }
    return ans;
    }
}