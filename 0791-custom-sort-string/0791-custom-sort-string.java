class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
      for(char ch:s.toCharArray()){
        hm.put(ch,hm.getOrDefault(ch,0)+1);
      }  
      StringBuilder sb=new StringBuilder();
      for(char ch:order.toCharArray()){
        if(hm.containsKey(ch)){
        while(hm.get(ch)>0){
            sb.append(ch);
            hm.put(ch,hm.get(ch)-1);
        }
        }
      }
    for(char ch:hm.keySet()){
        while(hm.get(ch)>0){
            sb.append(ch);
            hm.put(ch,hm.get(ch)-1);
        }
    }
    return sb.toString();
    }
}