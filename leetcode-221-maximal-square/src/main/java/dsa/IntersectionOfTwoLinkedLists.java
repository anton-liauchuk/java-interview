package dsa;

class IntersectionOfTwoLinkedLists {

    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;

        if (ptr1 == null || ptr2 == null)
            return null;

        while (ptr1 != ptr2) {
            ptr1 = (ptr1 != null) ? ptr1.next : headB;
            ptr2 = (ptr2 != null) ? ptr2.next : headA;
        }

        return ptr1;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}


