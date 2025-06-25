package mergeTwoSortedLists;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode list = new ListNode(-1);
        ListNode tail = list;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val){
                tail.val = list1.val;
                list1 = list1.next;
            }else{
                tail.val = list2.val;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;

        return list;
    }
}