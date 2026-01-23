class Solution {
    public Node copyRandomList(Node head) {
       Node curr=head;
       HashMap<Node,Node> map=new  HashMap<>();
       if(head==null) return head;
       while(curr!=null){
        map.put(curr,new Node(curr.val));
        curr=curr.next;}
        curr=head;
        
        while(curr!=null){
            Node nn=map.get(curr);
         nn.next=map.get(curr.next);
        nn.random=map.get(curr.random);
        curr=curr.next;
        } 
        return map.get(head);
    }
}