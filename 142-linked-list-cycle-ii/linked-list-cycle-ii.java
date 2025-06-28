/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null) return head; 
         ListNode first=head;
         ListNode sec=head;
         while(sec != null && sec.next!=null){
            first=first.next;
            sec=sec.next.next;
            if(first == sec){
                first=head;
                while(first != sec){
                    first=first.next;
                    sec=sec.next;
                }
                return sec;
            }
         }
         return null;
        
    }
}