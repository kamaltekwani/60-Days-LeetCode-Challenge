/*
 * Problem Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * Solution Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/1729/11-line-simple-java-solution-o-n-with-explanation/
 * 
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

class Q3_Longest_Substring_Without_Repeating_Characters 
{
    public int lengthOfLongestSubstring(String s) 
    {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int length = 0;
        int left = 0;

        for(int right=0 ; right<s.length() ; right++)
        {
            if(map.containsKey(s.charAt(right)))
                left = Math.max(left, map.get(s.charAt(right))+1);
            map.put(s.charAt(right), right);
            length = Math.max(length, right-left+1);
        }
        
        return length;
    }
}
