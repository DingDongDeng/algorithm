package problems.no11;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @DisplayName("기본 테스트 케이스 1")
    @Test
    public void test1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;

        assertThat(expected, is(equalTo(solution.maxArea(height))));
    }

    @DisplayName("기본 테스트 케이스 2")
    @Test
    public void test2() {
        int[] height = {1,1};
        int expected = 1;

        assertThat(expected, is(equalTo(solution.maxArea(height))));
    }

}