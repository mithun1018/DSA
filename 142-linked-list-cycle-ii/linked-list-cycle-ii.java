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
        ListNode temp=head;
        ArrayList<ListNode> arr=new ArrayList<>();
        while(temp !=null){
            if(!(arr.contains(temp))){
                arr.add(temp);
            }else{
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
}