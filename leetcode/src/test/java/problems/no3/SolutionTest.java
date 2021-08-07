package problems.no3;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();


    @Test
    void 기본_테스트_케이스_1() {

        String input = "abcabcbb";
        int expected = 3;

        assertThat(expected, is(equalTo(solution.lengthOfLongestSubstring(input))));
    }

    @Test
    void 기본_테스트_케이스_2() {

        String input = "bbbbb";
        int expected = 1;

        assertThat(expected, is(equalTo(solution.lengthOfLongestSubstring(input))));
    }

    @Test
    void 기본_테스트_케이스_3() {

        String input = "pwwkew";
        int expected = 3;

        assertThat(expected, is(equalTo(solution.lengthOfLongestSubstring(input))));
    }

    @Test
    void 기본_테스트_케이스_4() {

        String input = "";
        int expected = 0;

        assertThat(expected, is(equalTo(solution.lengthOfLongestSubstring(input))));
    }

    @Test
    void 기본_테스트_케이스_5() {

        String input = "tmmzuxt";
        int expected = 5;

        assertThat(expected, is(equalTo(solution.lengthOfLongestSubstring(input))));
    }
}