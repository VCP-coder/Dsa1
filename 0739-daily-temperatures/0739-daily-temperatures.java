class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[]=new int[temperatures.length];
        Deque<Integer> st=new ArrayDeque<>(); 
        for(int day=0;day<temperatures.length;day++){
            while(!st.isEmpty() && temperatures[day]>temperatures[st.peek()]){
                res[st.peek()]=day-st.peek();
                st.pop();
            }
            st.push(day);
        }
    return res;
    }
}