
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast= head;
        ListNode slow=head;
        ListNode ind=head;
        while(fast!=null && fast.next!=null){
           fast=fast.next.next;
           slow=slow.next;
           if(fast==slow){
            while(ind!=slow){
            ind=ind.next;
            slow=slow.next;}
            return ind;}}
  return null;}}
