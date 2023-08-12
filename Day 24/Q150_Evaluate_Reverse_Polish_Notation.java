/*
 * Problem Link : https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Solution Link : https://leetcode.com/problems/evaluate-reverse-polish-notation/solutions/1229403/js-python-java-c-easy-stack-solution-w-explanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

class Q150_Evaluate_Reverse_Polish_Notation 
{
    public int evalRPN(String[] tokens) 
    {
		Stack<String> stack = new Stack<String>();
	
		for(String s : tokens)
		{
			if(isOperand(s))
			{
				int b = Integer.parseInt(stack.pop());
				int a = Integer.parseInt(stack.pop());
				
				int c = 0;
				
				if(s.equals("+"))
					c = a+b;
				else if(s.equals("-"))
					c = a-b;
				else if(s.equals("*"))
					c = a*b;
				if(s.equals("/"))
					c = a/b;
				
				stack.push(c+"");
			}
			else 
				stack.push(s);
		}
		return Integer.parseInt(stack.peek());   
    }

		public boolean isOperand(String s)
	{
		return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
	}
}
