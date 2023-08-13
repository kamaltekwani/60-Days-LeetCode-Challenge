/*
 * Problem Link : https://leetcode.com/problems/min-stack/
 * Solution Link : https://leetcode.com/problems/min-stack/solutions/49078/simple-java-solution-12-line/
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q155_Min_Stack 
{
    Stack<int []> stack;

    public MinStack() 
    {
        stack = new Stack<int []>();
    }
    
    public void push(int val) 
    {
        int minimum=Integer.MAX_VALUE;
        if(!stack.isEmpty())
        {
            int array[] = stack.peek();
            minimum = array[1];
        }

        stack.push(new int[]{val, Math.min(minimum, val)});
    }
    
    public void pop() 
    {
        stack.pop();
    }
    
    public int top() 
    {
        int array[] = stack.peek();
        return array[0];
    }
    
    public int getMin() 
    {
        int array[] = stack.peek();
        return array[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
