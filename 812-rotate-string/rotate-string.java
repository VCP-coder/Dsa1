class Solution {
    public boolean rotateString(String s, String goal) {
        String conc=s.concat(s);
        if(s.length()==goal.length() && conc.contains(goal)){
            return true;
        }   
    return false;
     }
}