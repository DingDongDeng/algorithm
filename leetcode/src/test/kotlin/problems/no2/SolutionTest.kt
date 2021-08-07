package problems.no2

import org.junit.jupiter.api.Assertions.*

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution: Solution = Solution();

    @Test
    fun 테스트1() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        assertThat(intArrayOf(0, 1),`is`(equalTo(solution.twoSum(nums, target))))
    }

    @Test
    fun 테스트2() {
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        assertThat(intArrayOf(1, 2),`is`(equalTo(solution.twoSum(nums, target))))
    }

    @Test
    fun 테스트3() {
        val nums = intArrayOf(3, 3)
        val target = 6
        assertThat(intArrayOf(0, 1),`is`(equalTo(solution.twoSum(nums, target))))
    }
}