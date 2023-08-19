Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

 

Example 1:


Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]


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
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode curr=head;
        ListNode start=new ListNode(0);
        ListNode i=start;
        ListNode end=new ListNode(0);
        ListNode j=end;
        while(curr!=null){
            if(curr.val<x){
                i.next=new ListNode(curr.val);
                i=i.next;
            }
            else{
                j.next=new ListNode(curr.val);
                j=j.next;
            }
            curr=curr.next;
        }
        i.next=end.next;
        return start.next;
        
    }
}
