/*
 * Problem Link : https://leetcode.com/problems/valid-parentheses/
 * Solution Link : https://leetcode.com/problems/valid-parentheses/solutions/9178/short-java-solution/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

class Q20_Valid_Parentheses
{
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray())
        {
            if(c == '(')
                stack.push(')');
            else if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
        
        return stack.isEmpty();
    }
}
