class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode dummy=new ListNode(-1);
     ListNode temp=dummy;
     int carry=0;
while(l1!=null || l2!=null){
        int v1= ((l1!=null)?l1.val:0);
         int v2= ((l2!=null)?l2.val:0);
      int bb=v1+v2+carry;
      carry=bb/10;
      temp.next= new ListNode(bb%10);
      temp=temp.next;
      if(l1!=null) l1=l1.next;
        if(l2!=null) l2=l2.next;
     } 
     if(carry>0) temp.next=new ListNode(carry);
     return dummy.next;  
    }}
