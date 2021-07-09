package problems.no2;

import java.util.Objects;
import problems.no2.Solution_custom.ListNode.ListNodeBuilder;

class Solution_custom {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNodeBuilder builder = ListNode.builder();

        ListNode listA = l1;
        ListNode listB = l2;
        int round = 0;
        while (true) {
            int valueA = Objects.nonNull(listA) ? listA.getVal() : 0;
            int valueB = Objects.nonNull(listB) ? listB.getVal() : 0;
            int sum = valueA + valueB + round;
            round = sum / 10;
            builder.add(sum % 10);
            listA = Objects.nonNull(listA) ? listA.getNext() : null;
            listB = Objects.nonNull(listB) ? listB.getNext() : null;

            if (Objects.isNull(listA) && Objects.isNull(listB)) {
                break;
            }
        }
        if (round != 0) {
            builder.add(round);
        }

        return builder.build();
    }

    public static class ListNode {

        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public ListNode getNext() {
            return next;
        }

        private void setNext(ListNode next) {
            this.next = next;
        }

        public static ListNodeBuilder builder() {
            return new ListNodeBuilder();
        }

        public static class ListNodeBuilder {

            private ListNode head;
            private ListNode tail;

            public ListNodeBuilder add(int val) {
                ListNode node = new ListNode(val);
                if (Objects.isNull(head)) {
                    this.head = node;
                    this.tail = node;
                    return this;
                }
                this.tail.setNext(node);
                this.tail = node;
                return this;
            }

            public ListNode build() {
                return this.head;
            }
        }

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

    }
}