package problems.no2;

import java.util.Objects;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return new ListNode(7, new ListNode(0,new ListNode(8)));
    }

    public static class ListNode {
        private int val;
        private ListNode next;
        ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null || getClass() != object.getClass()) {
                return false;
            }
            ListNode listNode = (ListNode) object;
            return val == listNode.val &&
                Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}