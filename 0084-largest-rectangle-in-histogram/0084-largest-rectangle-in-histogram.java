class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        int i = 0;
        while (i < heights.length) 
        {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) 
            {
                stack.push(i);
                i++;
            }
            else 
            {
                int p = stack.pop();
                int h = heights[p];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(h * w, max);
            }
        }
        while (!stack.isEmpty()) 
        {
            int p = stack.pop();
            int h = heights[p];
            int w = stack.isEmpty() ? i : i - stack.peek() - 1;
            max = Math.max(h * w, max);
        }
        return max;
    }
}