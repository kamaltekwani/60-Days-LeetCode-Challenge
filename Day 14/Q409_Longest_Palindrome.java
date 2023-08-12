/*
 * Problem Link : https://leetcode.com/problems/longest-palindrome/
 * Solution Link : https://www.youtube.com/watch?v=nc6_ECK_qrY
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q409_Longest_Palindrome 
{
    public int longestPalindrome(String s) 
    {
        int frequency[] = new int[256];
        int count = 0;
        int oddCount = 0;

        for(char c : s.toCharArray())
            frequency[c]++;

        for(int value : frequency)
        {
            count += 2 * (value / 2);
            if(value % 2 == 1)
                oddCount = 1;
        }

        return count + oddCount;
    }
}
