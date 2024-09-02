package com.mahesh.algorithms;

public class RemoveDuplicatesFromSortedLinkedList {
    public static void main(String[] args) {

        ListNode listNode = new ListNode();
        listNode.val = 1;
        listNode.next = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null))));


        removeDuplicate(listNode);

    }

    private static void removeDuplicate(ListNode listNode) {

        ListNode head = listNode;
        ListNode prev = head;
        ListNode current = head.next;

        while(current != null) {
            if(prev.val != current.val) {
                prev.next = current;
                prev = current;
            }
            current = current.next;
        }
        prev.next = current;
        prev = current;
        System.out.println("Final list is "+head);
    }
}

