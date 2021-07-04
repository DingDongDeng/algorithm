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
        ListNode list1 = new ListNode(2, new ListNode(4,new ListNode(3)));
        ListNode list2 = new ListNode(5, new ListNode(6,new ListNode(4)));

        ListNode expected = new ListNode(7, new ListNode(0,new ListNode(8)));
        ListNode result = solution.addTwoNumbers(list1, list2);

        assertThat(expected, is(equalTo(result)));
    }

    @Test
    void 테스트_케이스_2() {
    }

    @Test
    void 테스트_케이스_3() {
    }
}