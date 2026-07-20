class Solution {
    public boolean isMatched(char open,char close){
        return (open=='(' && close==')') || 
        (open=='{' && close=='}') || 
        (open=='[' && close==']');
    }
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack<>();
        for(char ch: s.toCharArray()){
        if(ch=='(' || ch=='{' || ch=='['){
            st.push(ch);
        }
        else if(st.isEmpty() || !isMatched(st.pop(),ch)){
            return false;
        }
        }
    return st.isEmpty();
    }
}