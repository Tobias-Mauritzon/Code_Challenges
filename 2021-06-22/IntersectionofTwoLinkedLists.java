import java.util.HashSet;

public class IntersectionofTwoLinkedLists {
  
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null
    // no cycles exists
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)return null;

        HashSet<ListNode> set = new HashSet<>();

        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }

        ListNode start;

        while(headB != null){
            if(set.contains(headB)){
                start = headB;
                while(set.contains(headB)){
                    headB = headB.next;
                    if(headB == null){
                        return start;
                    }
                }
            }
            headB = headB.next;
        }

        return null;
    }

    //Neater. Could also combine the 2 loops and return first node that matches
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)return null;

        HashSet<ListNode> set = new HashSet<>();

        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }

        while(headB != null){
            if(set.contains(headB))return headB;

            headB = headB.next;
        }

        return null;
    }
}
