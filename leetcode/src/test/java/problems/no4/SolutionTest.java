package problems.no4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void 기본_테스트_케이스_1() {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expected = 2;

        assertThat(expected, is(equalTo(solution.findMedianSortedArrays(nums1, nums2))));

    }

    @Test
    void 기본_테스트_케이스_2() {

        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double expected = 2.5;

        assertThat(expected, is(equalTo(solution.findMedianSortedArrays(nums1, nums2))));

    }

    @Test
    void 기본_테스트_케이스_3() {

        int[] nums1 = {0, 0};
        int[] nums2 = {0, 0};
        double expected = 0;

        assertThat(expected, is(equalTo(solution.findMedianSortedArrays(nums1, nums2))));

    }

    @Test
    void 기본_테스트_케이스_4() {

        int[] nums1 = {};
        int[] nums2 = {1};
        double expected = 1;

        assertThat(expected, is(equalTo(solution.findMedianSortedArrays(nums1, nums2))));

    }

    @Test
    void 기본_테스트_케이스_5() {

        int[] nums1 = {2};
        int[] nums2 = {};
        double expected = 2;

        assertThat(expected, is(equalTo(solution.findMedianSortedArrays(nums1, nums2))));

    }

    @Test
    void 추가_테스트_케이스_6() {

        int[] nums1 = {2,2,4,4};
        int[] nums2 = {2,2,4,4};
        double expected = 3;

        assertThat(expected, is(equalTo(solution.findMedianSortedArrays(nums1, nums2))));

    }
}

