package com.mahesh.algorithms;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

        // [1, 4, 5] [2, 3, 6]
        // [1,2,3,4,5,6]

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4, new ListNode(5, null));

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(3, new ListNode(6, null));

        ListNode finalList = new ListNode();
        ListNode head1 = list1;
        ListNode head2 = list2;



    }
}


class ListNode {
  int val;
  ListNode next;
  public ListNode() {}
  public ListNode(int val) { this.val = val; }
  public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
