class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int openbracket=0;
        for(Character c:s.toCharArray()){
            if(c=='('){
                openbracket++;
            }
            else if(c==')'){
                openbracket--;
            }
        ans=Math.max(ans,openbracket);
        }
    return ans;
    }
}