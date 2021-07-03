package problems.no1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void 기본_테스트_케이스_1() {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        assertThat(new int[]{0, 1}, is(equalTo(solution.twoSum(nums, target))));
    }

    @Test
    void 기본_테스트_케이스_2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        assertThat(new int[]{1, 2}, is(equalTo(solution.twoSum(nums, target))));

    }

    @Test
    void 기본_테스트_케이스_2___정렬된리스트() {
        int[] nums = {2, 3, 4};
        int target = 6;

        assertThat(new int[]{0, 2}, is(equalTo(solution.twoSum(nums, target))));

    }

    @Test
    void 기본_테스트_케이스_3() {

        int[] nums = {3, 3};
        int target = 6;

        assertThat(new int[]{0, 1}, is(equalTo(solution.twoSum(nums, target))));

    }

    @Test
    void 기본_테스트_케이스_4() {

        int[] nums = {-3,4,3,90};
        int target = 0;

        assertThat(new int[]{0, 2}, is(equalTo(solution.twoSum(nums, target))));

    }

    @Test
    void 리스트에서_불필요_인덱스_시작값_찾기() throws Exception {
        List<Integer> sortedNumList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int target = 2;
        int result = executeFindStartOfNeedlessIndex(sortedNumList, target);
        int expected = 1;
        assertThat(expected, is(result));
    }

    @Test
    void 리스트에서_불필요_인덱스_시작값_찾기2___사잇값찾기() throws Exception {
        List<Integer> sortedNumList = Arrays.asList(1, 5, 6, 7, 9, 11, 14);
        int target = 8;
        Integer result = executeFindStartOfNeedlessIndex(sortedNumList, target);
        Integer expected = 4;
        assertThat(expected, is(result));
    }

    @Test
    void 리스트에서_불필요_인덱스_시작값_찾기3___끝전값찾기() throws Exception {
        List<Integer> sortedNumList = Arrays.asList(1, 2, 3, 4, 5, 6, 9);
        int target = 8;
        int result = executeFindStartOfNeedlessIndex(sortedNumList, target);
        Integer expected = 6;
        assertThat(expected, is(result));
    }

    @Test
    void 리스트에서_불필요_인덱스_시작값_찾기4___끝값찾기() throws Exception {
        List<Integer> sortedNumList = Arrays.asList(1, 2, 3, 4, 5, 6, 9);
        int target = 9;
        Integer result = executeFindStartOfNeedlessIndex(sortedNumList, target);
        Integer expected = 6;
        assertThat(expected, is(result));
    }

    @Test
    void 리스트에서_불필요_인덱스_시작값_찾기3___맨앞전값찾기() throws Exception {
        List<Integer> sortedNumList = Arrays.asList(-4, -2, 3, 4, 5, 6, 9);
        int target = -2;
        int result = executeFindStartOfNeedlessIndex(sortedNumList, target);
        Integer expected = 1;
        assertThat(expected, is(result));
    }

    @Test
    void 리스트에서_불필요_인덱스_시작값_찾기4___맨앞값찾기() throws Exception {
        List<Integer> sortedNumList = Arrays.asList(-3, 2, 3, 4, 5, 6, 9);
        int target = -3;
        Integer result = executeFindStartOfNeedlessIndex(sortedNumList, target);
        Integer expected = 0;
        assertThat(expected, is(result));
    }

    @Test
    void 남은_값이_있는_인덱스_찾기__남은값이_양수() throws Exception {
        List<Integer> filteredNumList = Arrays.asList(-3, 2, 3, 4, 5, 6, 9);
        int remainValue = +6;
        Integer result = executeFindRemainValueIndex(filteredNumList, remainValue);
        Integer expected = 5;
        assertThat(expected, is(result));
    }

    @Test
    void 남은_값이_있는_인덱스_찾기__남은값이_음수() throws Exception {
        List<Integer> filteredNumList = Arrays.asList(-7, -6, -3, 2, 3, 4, 5, 6, 9);
        int remainValue = -6;
        Integer result = executeFindRemainValueIndex(filteredNumList, remainValue);
        Integer expected = 1;
        assertThat(expected, is(result));
    }


    private Integer executeFindStartOfNeedlessIndex(List<Integer> sortedNumList, int target) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        log.info("sortedNumList = {}, target = {}", sortedNumList, target);
        Method method = solution.getClass().getDeclaredMethod("findStartOfNeedlessIndex", List.class, int.class);
        method.setAccessible(true);
        return (int) method.invoke(solution, sortedNumList, target);
    }

    private Integer executeFindRemainValueIndex(List<Integer> filteredNumList, int remainValue) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        log.info("filteredNumList = {}, remainValue = {}", filteredNumList, remainValue);
        Method method = solution.getClass().getDeclaredMethod("findRemainValueIndex", List.class, int.class);
        method.setAccessible(true);
        return (Integer) method.invoke(solution, filteredNumList, remainValue);
    }
}