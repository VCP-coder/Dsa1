class Solution {
    public String minWindow(String s, String t) {
        if(s.length()< t.length()){
            return "";
        }
        Map<Character,Integer> mp=new HashMap<>();
        for(char ch:t.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int start=-1;
        int left=0;
        int count=0;
        int needed=t.length();
        int minLen=Integer.MAX_VALUE;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(mp.containsKey(ch)){
                if(mp.get(ch)>0){
                    count++;
                }
                mp.put(ch,mp.get(ch)-1);
            }
        while(count==needed){

            if(minLen>right-left+1){
                minLen=right-left+1;
                start=left;
            }
            char leftChar=s.charAt(left);
            if(mp.containsKey(leftChar)){
                mp.put(leftChar,mp.get(leftChar)+1);

                if(mp.get(leftChar)>0){
                    count--;
                }
            }
        left++;
        }
        }
    return minLen==Integer.MAX_VALUE? "":s.substring(start,start+minLen);
    }
}