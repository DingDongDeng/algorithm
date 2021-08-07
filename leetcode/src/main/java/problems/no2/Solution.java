package problems.no2;


import java.util.Objects;

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNodeBuilder builder = new ListNodeBuilder();

        ListNode listA = l1;
        ListNode listB = l2;
        int round = 0;
        while (true) {
            int valueA = Objects.nonNull(listA) ? listA.val : 0;
            int valueB = Objects.nonNull(listB) ? listB.val : 0;
            int sum = valueA + valueB + round;
            round = sum / 10;
            builder.add(sum % 10);
            listA = Objects.nonNull(listA) ? listA.next : null;
            listB = Objects.nonNull(listB) ? listB.next : null;

            if (Objects.isNull(listA) && Objects.isNull(listB)) {
                break;
            }
        }
        if (round != 0) {
            builder.add(round);
        }

        return builder.build();
    }

}

class ListNodeBuilder {

    private ListNode head;
    private ListNode tail;

    public ListNodeBuilder add(int val) {
        ListNode node = new ListNode(val);
        if (Objects.isNull(head)) {
            this.head = node;
            this.tail = node;
            return this;
        }
        this.tail.next = node;
        this.tail = node;
        return this;
    }

    public ListNode build() {
        return this.head;
    }
}

//leetcode에서는 제출할때는 제거
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
