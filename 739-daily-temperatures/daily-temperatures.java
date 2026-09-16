class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
       int res[]=new int[n];
       Stack<Integer> st=new Stack<>();
       for(int day=0;day<n;day++){
        while(!st.isEmpty() && temperatures[day]>temperatures[st.peek()]){
            res[st.peek()]=day-st.peek();
            st.pop();
        }
        st.push(day);
       }
    return res;
    }
}