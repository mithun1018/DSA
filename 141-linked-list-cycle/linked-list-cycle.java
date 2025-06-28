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
        ListNode temp=head;
        if(head == null){
            return false;
        }
        ArrayList<ListNode> arr=new ArrayList<>();
        while(temp.next != null){
            if(!(arr.contains(temp.next))){
                arr.add(temp.next);
            }else{
                return true;
            }
             temp=temp.next;
        }
        return false;
        
    }
}