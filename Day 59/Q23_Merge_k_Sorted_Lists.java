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
 * Problem Link : https://leetcode.com/problems/merge-k-sorted-lists/description/
 * Solution Link : https://leetcode.com/problems/merge-k-sorted-lists/solutions/10522/my-simple-java-solution-use-recursion/
 *
 */ 

class Q23_Merge_k_Sorted_Lists 
{
    public ListNode merge(ListNode list1, ListNode list2)
    {
        if(list1 == null && list2 == null)
            return null;

        if(list1 == null)
            return list2;

        if(list2 == null)
            return list1;

        if(list1.val < list2.val)
        {
            list1.next = merge(list1.next, list2);
            return list1;
        }
        else
        {
            list2.next = merge(list1, list2.next);
            return list2;
        }
    }

    public ListNode mergeLinkedList(ListNode lists[], int left, int right)
    {
        if(left == right)
            return lists[left];
        else if(left < right)
        {
            int mid = left + (right - left)/2;

            ListNode list1 = mergeLinkedList(lists, left, mid);
            ListNode list2 = mergeLinkedList(lists, mid+1, right);
    
            return merge(list1, list2);
        }
        else
            return null;
    }

    public ListNode mergeKLists(ListNode[] lists) 
    {
        return mergeLinkedList(lists, 0, lists.length-1);
    }
}
