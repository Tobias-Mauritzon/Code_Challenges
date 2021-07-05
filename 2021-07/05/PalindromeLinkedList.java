import java.util.LinkedList;

public class PalindromeLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        StringBuilder strB = new StringBuilder();
        while(head != null){
            strB.append(head.val);
            head = head.next;
        }
        StringBuilder old = new StringBuilder().append(strB);
        strB.reverse();
        if (old.toString().equals(strB.toString()))return true;
        return false;
    }

    //About the same performance as Stringbuilder
    public boolean isPalindrome3(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();
        ListNode node = head;

        while(node != null){
            list.addLast(node.val);
            node = node.next;
        }
        
        while(head != null){
            if(head.val != list.removeLast())return false;
            head = head.next;
        }
        return true;
    }

    // To slow
    public boolean isPalindrome2(ListNode head) {
        String forward = "";
        String backward = "";

        while(head != null){
            forward = forward + head.val;
            backward = head.val + backward;
            head = head.next;
        }

        if (forward.equals(backward))return true;
        return false;
    }
}
