import DataStructure.ListNode;

/**
 * Created by Yiding Liu on 1/19/2017.
 */
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node=new ListNode(-1);
        ListNode newHead=node;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                node.next=l2;
                l2=l2.next;
            }
            else{
                node.next=l1;
                l1=l1.next;
            }
            node=node.next;
        }
        if(l1!=null) node.next=l1;
        if(l2!=null) node.next=l2;

        return newHead.next;
    }
}
