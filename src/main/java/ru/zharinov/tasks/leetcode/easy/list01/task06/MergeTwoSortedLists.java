package ru.zharinov.tasks.leetcode.easy.list01.task06;

import java.util.*;

/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.


* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode() {}
*     ListNode(int val) { this.val = val; }
*     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
*/
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = null;
        ListNode list2 = null;

        list1 = new ListNode(1, null);
        list1.next = new ListNode(2, new ListNode(4, null));

        list2 = new ListNode(1, null);
        list2.next = new ListNode(3, new ListNode(4, null));

        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();
        ListNode result = null;
        ListNode last = null;
        addAll(list1, list);
        addAll(list2, list);
        list.sort(Integer::compareTo);
        for (Integer i : list) {
            if (result == null) {
                result = new ListNode(i, null);
                last = result;
            } else {
                ListNode newNode = last;
                last = new ListNode(i, null);
                newNode.next = last;
            }
        }
        return result;
    }

    private static void addAll(ListNode listNode, List<Integer> list) {
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
