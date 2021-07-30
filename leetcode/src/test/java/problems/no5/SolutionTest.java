package problems.no5;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void 기본_테스트_케이스_1() {
        String input = "babad";
        String expected = "bab";
        assertThat(expected, is(solution.longestPalindrome(input)));
    }

    @Test
    public void 기본_테스트_케이스_2() {
        String input = "cbbd";
        String expected = "bb";
        assertThat(expected, is(solution.longestPalindrome(input)));
    }

    @Test
    public void 기본_테스트_케이스_3() {
        String input = "a";
        String expected = "a";
        assertThat(expected, is(solution.longestPalindrome(input)));
    }

    @Test
    public void 기본_테스트_케이스_4() {
        String input = "ac";
        String expected = "a";
        assertThat(expected, is(solution.longestPalindrome(input)));
    }

    @Test
    public void 회문_감별_로직_테스트() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        assertThat(true, is(executeIsPalindrome("a".toCharArray())));
        assertThat(true, is(executeIsPalindrome("aa".toCharArray())));
        assertThat(true, is(executeIsPalindrome("aaa".toCharArray())));
        assertThat(true, is(executeIsPalindrome("abcba".toCharArray())));
        assertThat(true, is(executeIsPalindrome("abba".toCharArray())));
        assertThat(false, is(executeIsPalindrome("de".toCharArray())));
        assertThat(false, is(executeIsPalindrome("def".toCharArray())));
        assertThat(false, is(executeIsPalindrome("gfgf".toCharArray())));
        assertThat(false, is(executeIsPalindrome("gffgs".toCharArray())));
        assertThat(false, is(executeIsPalindrome("dddf".toCharArray())));
        assertThat(false, is(executeIsPalindrome("".toCharArray())));
    }

    private final PalindromeExtractor palindromeExtractor = new PalindromeExtractor();

    private boolean executeIsPalindrome(char[] chars) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = palindromeExtractor.getClass().getDeclaredMethod("isPalindrome", char[].class);
        method.setAccessible(true);
        return (Boolean) method.invoke(palindromeExtractor, chars);
    }
}