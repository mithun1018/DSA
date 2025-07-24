/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        int count=0;
        Node temp=head;
        boolean flag = true;
        while(flag){
            if(temp.next == null) flag=false;
            count++;
            temp=temp.next;
        }
        temp=head;
        int val=0;
        for(int i=0;i<(count/2)+1;i++){
            val=temp.data;
            temp=temp.next;
        }
        return val;
        
    }
}