
/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, 
 * and return the new head.
 */
public class RemoveLinkedListElements {

     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements2(ListNode head, int val) { 
        if(head == null)return null;

        while(head != null){
            if(head.val != val){
                break;
            }
            if(head.next != null){
                head = head.next;
            }else{
                return null;
            }
        }

        ListNode next = head.next;
        ListNode lastLink = head;

        while(next.next != null){
            next = next.next;

            if(next.val != val){
                lastLink.next = next;
                lastLink = next;
            }
        }
        lastLink.next = null;

        return head;
    }

    public ListNode removeElements(ListNode head, int val) { 
        if(head == null)return null;
        ListNode newHead = null;

        while(newHead == null){
            if(head.val != val){
                newHead = head;
                break;
            }
            if(head.next != null){
                head = head.next;
            }else{
                return null;
            }
        }

        ListNode next = newHead.next;
        ListNode lastLink = newHead;

        while(next.next != null){
            next = next.next;

            if(next.val != val){
                lastLink.next = next;
                lastLink = next;
            }
        }
        lastLink.next = null;

        return newHead;
    }
}
