import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLists {

    //Works with recursion
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)return new ListNode();
        if(l1 == null)return l2;
        if(l2 == null)return l1;

        if(l1.val > l2.val){
            return new ListNode(l2.val, mergeTwoLists2(l1, l2.next));
        }else{
            return new ListNode(l1.val, mergeTwoLists2(l1.next, l2));
        }

    }   

    //Can not add nodes
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ArrayList<Integer> list = new ArrayList<>();


        while(l1 != null){
            list.add(l1.val);
            l1 = l1.next;
        }

        while(l2 != null){
            list.add(l2.val);
            l2 = l2.next;
        }       

        Collections.sort(list);

        if(list.size() == 0)return new ListNode();        

        if(list.size() == 1)return new ListNode(list.get(0));

        if(list.size() == 2)return new ListNode(list.get(0), new ListNode(list.get(1)));

        ListNode temp = new ListNode(list.get(1), new ListNode(list.get(2)));
        ListNode myListNodeStart = new ListNode(list.get(0), temp);

        for(int i = 3; i < list.size(); i++){
            temp = new ListNode(temp.next.val, new ListNode(list.get(i)));
        }

        return myListNodeStart;
    }

    

}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}