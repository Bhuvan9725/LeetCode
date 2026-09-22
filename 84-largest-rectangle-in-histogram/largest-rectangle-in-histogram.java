class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int res=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                int tp=st.pop();
                int width=st.isEmpty()?i:i-st.peek()-1;
                res=Math.max(res,heights[tp]*width);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int tp=st.pop();
            int  width = st.isEmpty()? n: n - st.peek() - 1;
            res = Math.max(res, heights[tp] * width);
        }
        return res;
    }
}