class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
          return false;
        HashMap<Character,Integer> alpha=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char letter=s.charAt(i);
            alpha.put(letter,alpha.getOrDefault(letter,0)+1);
        }
        for(int j=0;j<t.length();j++){
            char letter=t.charAt(j);
            if(!alpha.containsKey(letter) || alpha.get(letter)==0)
              return false;
         alpha.put(letter,alpha.get(letter)-1);
        }
    return true;
    }
}