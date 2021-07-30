package problems.no5;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();
    @Test
    public void 기본_테스트_케이스_1(){
        String input = "babad";
        String expected = "bab";
        assertThat(expected, is(solution.longestPalindrome(input)));
    }

    @Test
    public void 기본_테스트_케이스_2(){
        String input = "cbbd";
        String expected = "bb";
        assertThat(expected, is(solution.longestPalindrome(input)));
    }

    @Test
    public void 기본_테스트_케이스_3(){
        String input = "a";
        String expected = "a";
        assertThat(expected, is(solution.longestPalindrome(input)));
    }

    @Test
    public void 기본_테스트_케이스_4(){
        String input = "ac";
        String expected = "a";
        assertThat(expected, is(solution.longestPalindrome(input)));
    }

}