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

    public boolean hasCycle(ListNode head) {
        if(head == null) return false; 
        if(head.next == null) return false; 

         ListNode first=head;
         ListNode sec=head;
         while(sec != null && sec.next!=null){
            first=first.next;
            sec=sec.next.next;
            if(first == sec) return true;
         }
         return false;
        
    }
}