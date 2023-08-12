/*
 * Problem Link : https://leetcode.com/problems/add-binary/
 * Solution Link : https://leetcode.com/problems/add-binary/solutions/24488/short-ac-solution-in-java-with-explanation/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q67_Add_Binary 
{
    public String addBinary(String a, String b) 
    {
        int i = a.length()-1;
        int j = b.length()-1;

        StringBuilder sb = new StringBuilder();

        int carry = 0;

        while(i >= 0 || j >= 0)
        {
            int sum = carry;
            if(i >= 0)
                sum+=a.charAt(i) - '0';
            
            if(j >= 0)
                sum+=b.charAt(j) - '0';

            sb.append(sum % 2);
            carry = sum/2;

            i--;
            j--;
        }

        if(carry != 0) 
            sb.append(carry);

        return sb.reverse().toString();
    }
}
