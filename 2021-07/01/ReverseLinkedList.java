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

    //Somewhat ugly recursion
    public ListNode reverseList4(ListNode head) {
        ListNode n = null;
        n = rec(n, head);
        return n;
    }

    ListNode rec(ListNode newHead, ListNode head){
        ListNode temp = new ListNode(head.val);
        ListNode temp2 = newHead;
        newHead = temp;
        newHead.next = temp2;
        if(head.next != null)newHead = rec(newHead,head.next);
        
        return newHead;
    }

    //Removed check for head == null and other because it was not nessecary
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
