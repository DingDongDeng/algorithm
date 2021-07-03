package problems.no1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@Slf4j
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void 테스트1() {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        assertThat(new int[]{0, 1}, is(equalTo(solution.twoSum(nums, target))));
    }

    @Test
    void 테스트2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        assertThat(new int[]{1, 2}, is(equalTo(solution.twoSum(nums, target))));

    }

    @Test
    void 테스트3() {

        int[] nums = {3, 3};
        int target = 6;

        assertThat(new int[]{0, 1}, is(equalTo(solution.twoSum(nums, target))));

    }
}