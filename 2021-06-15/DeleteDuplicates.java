public class DeleteDuplicates {
    
    // Delete nodes with duplicate values  in sorted ListNode
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null){
            return head;
        }else if(head.next == null){
            return head;
        }

        ListNode nodeCurrent = head;
        ListNode nodeNext = head.next;

        while(nodeNext != null){
            if(nodeCurrent.val == nodeNext.val){
                nodeCurrent.next = nodeNext.next;
                nodeNext = nodeNext.next;
            }else{
                nodeCurrent = nodeNext;
                nodeNext = nodeNext.next;
            }
        }

        return head;
    }
}
  

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}