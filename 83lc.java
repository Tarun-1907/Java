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
   public ListNode deleteDuplicates(ListNode head) {
       ListNode currNode=new ListNode();
       if(head==null){
           return head;
       }
           currNode=head;
           while(currNode!=null){
           if(currNode.next!=null && currNode.val==currNode.next.val){
               currNode.next=currNode.next.next;
           }else
           currNode=currNode.next;
           }
       return head;
       }
   } {
    
}
