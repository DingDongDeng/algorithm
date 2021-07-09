package problems.no2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import problems.no2.Solution.ListNode;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();
    @Test
    void 테스트_케이스_1() {
        ListNode list1 = ListNode.builder().add(2).add(4).add(3).build();
        ListNode list2 = ListNode.builder().add(5).add(6).add(7).build();

        ListNode expected = ListNode.builder().add(7).add(0).add(8).build();
        ListNode result = solution.addTwoNumbers(list1, list2);

        assertThat(expected, is(equalTo(result)));
    }

    @Test
    void 테스트_케이스_2() {
        ListNode list1 = ListNode.builder().add(0).build();
        ListNode list2 = ListNode.builder().add(0).build();

        ListNode expected = ListNode.builder().add(0).build();
        ListNode result = solution.addTwoNumbers(list1, list2);

        assertThat(expected, is(equalTo(result)));
    }

    @Test
    void 테스트_케이스_3() {
        ListNode list1 = ListNode.builder().add(9).add(9).add(9).add(9).add(9).add(9).add(9).build();
        ListNode list2 = ListNode.builder().add(9).add(9).add(9).add(9).build();

        ListNode expected = ListNode.builder().add(8).add(9).add(9).add(9).add(0).add(0).add(0).add(1).build();
        ListNode result = solution.addTwoNumbers(list1, list2);

        assertThat(expected, is(equalTo(result)));
    }
}