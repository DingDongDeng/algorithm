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
    public void 기본_테스트_케이스_5() {
        String input ="aacabdkacaa";
        String expected = "aca";
        assertThat(expected, is(solution.longestPalindrome(input)));
    }


    @Test
    public void 회문_감별_로직_테스트() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        assertThat(true, is(executeIsPalindrome("a".toCharArray(), 0, 0)));
        assertThat(true, is(executeIsPalindrome("aa".toCharArray(), 0, 1)));
        assertThat(true, is(executeIsPalindrome("aaa".toCharArray(), 0, 2)));
        assertThat(true, is(executeIsPalindrome("abcba".toCharArray(), 0, 4)));
        assertThat(true, is(executeIsPalindrome("abba".toCharArray(), 0, 3)));
        assertThat(false, is(executeIsPalindrome("de".toCharArray(), 0, 1)));
        assertThat(false, is(executeIsPalindrome("def".toCharArray(), 0, 2)));
        assertThat(false, is(executeIsPalindrome("gfgf".toCharArray(), 0, 3)));
        assertThat(false, is(executeIsPalindrome("gffgs".toCharArray(), 0, 4)));
        assertThat(false, is(executeIsPalindrome("dddf".toCharArray(), 0, 3)));
        assertThat(false, is(executeIsPalindrome("aacabdkacaa".toCharArray(), 0, 10)));
        assertThat(false, is(executeIsPalindrome("".toCharArray(), 0, 0)));
    }
    @Test
    public void 회문_감별_로직_테스트2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        assertThat(false, is(executeIsPalindrome("cabdkac".toCharArray(), 0, 6)));
    }
    private final PalindromeExtractor palindromeExtractor = new PalindromeExtractor();

    private boolean executeIsPalindrome(char[] chars, int start, int end) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = palindromeExtractor.getClass().getDeclaredMethod("isPalindrome", char[].class, int.class, int.class);
        method.setAccessible(true);
        return (Boolean) method.invoke(palindromeExtractor, chars, start, end);
    }
}