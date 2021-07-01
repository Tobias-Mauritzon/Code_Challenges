/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //Very good solution2
    public ListNode reverseList3(ListNode head) {
        
        ListNode current = null;

        while(head != null){
            ListNode temp = new ListNode(head.val);
            ListNode temp2 = current;
            current = temp;
            current.next = temp2;
            head = head.next;   
        }

        return current;
    }
    
    //Very good solution
    public ListNode reverseList2(ListNode head) {
        if(head == null)return null;
        if(head.next == null)return head;
        
        ListNode current = null;

        while(head != null){
            ListNode temp = new ListNode(head.val);
            ListNode temp2 = current;
            current = temp;
            current.next = temp2;
            head = head.next;   
        }

        return current;
    }

    //Not working
    public ListNode reverseList(ListNode head) {
        if(head == null)return null;
        if(head.next == null)return head;
        
        ListNode current = head;
        current.next = null;

        while(head.next != null){

            ListNode temp = head.next;
            ListNode temp2 = current;

            current = temp;
            current.next = temp2;

            head = head.next;
            

        }

        return current;
    }
}
