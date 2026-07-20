class Solution {
    String removebackSpace(String str){
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch!='#'){
                sb.append(ch);
            }
            else if(sb.length()>0 && ch=='#'){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        return removebackSpace(s).equals(removebackSpace(t));
    }
}