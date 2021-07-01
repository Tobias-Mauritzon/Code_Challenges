import java.util.HashSet;

public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
	
	// Returns true if listnode has a cycle
	// apparently you could also do this with floyd's algorithm
    public boolean hasCycle(ListNode head) {
        if(head == null)return false;

        HashSet<ListNode> set = new HashSet<>();

        while(head.next != null){
            
            if(set.contains(head)){
                return true; 
            }

            set.add(head);
            head = head.next;
        }

        return false;
    }
}