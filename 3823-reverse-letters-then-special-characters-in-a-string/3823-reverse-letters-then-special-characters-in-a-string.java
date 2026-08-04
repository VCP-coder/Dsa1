class Solution {
    public String reverseByType(String s) {
        Stack<Character> stl=new Stack<>();
        Stack<Character> sts=new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                stl.push(ch);
            }
            else{
                sts.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                sb.append(stl.pop());
            }
            else{
                sb.append(sts.pop());
            }
        }
    return sb.toString();
    }
}