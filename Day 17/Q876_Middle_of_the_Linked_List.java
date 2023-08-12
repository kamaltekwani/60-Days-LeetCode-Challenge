/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*
 * Problem Link : https://leetcode.com/problems/middle-of-the-linked-list/
 * Solution Link : https://leetcode.com/problems/middle-of-the-linked-list/solutions/154619/c-java-python-slow-and-fast-pointers/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q876_Middle_of_the_Linked_List 
{
    public ListNode middleNode(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
