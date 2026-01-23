class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
         if(head==null||head.next==null||k==1){
        return head;
    }
    ListNode start=head;
     ListNode end=head;
     int i=0;
     while(i<k){
        if(end==null) return head;
        end=end.next;
        i++;
     }
    ListNode ans= reverse(start,end);
   start.next= reverseKGroup(end,  k);
   return ans;

}
public static ListNode reverse(ListNode start,ListNode end){
    ListNode prev=null;
    ListNode curr=start;
    while(curr!=end){
    ListNode temp=curr.next;
    curr.next=prev;
    prev=curr;
    curr=temp;}
return prev;
}}