/**
 * Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, 
 * instead you will be given access to the node to be deleted directly.
 * 
 * It is guaranteed that the node to be deleted is not a tail node in the list.
 */

public class DeleteNodeinaLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

	// Just better but not faster on submission probably because of insufficient testing
    public void deleteNode2(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }

    public void deleteNode(ListNode node) { 
        while(node != null){
            node.val = node.next.val;
            if(node.next.next == null)node.next = null;
            node = node.next;
        }
        
    }
}
