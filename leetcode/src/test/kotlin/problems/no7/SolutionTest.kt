package problems.no7

import org.junit.jupiter.api.Assertions.*

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution: Solution = Solution()

    @Test
    fun 테스트_케이스_1() {
        val input = 123
        val output = 321
        assertThat(output, `is`(equalTo(solution.reverse(input))))
    }

    @Test
    fun 테스트_케이스_2() {
        val input = -123
        val output = -321
        assertThat(output, `is`(equalTo(solution.reverse(input))))
    }

    @Test
    fun 테스트_케이스_3() {
        val input = 120
        val output = 21
        assertThat(output, `is`(equalTo(solution.reverse(input))))
    }

    @Test
    fun 테스트_케이스_4() {
        val input = 0
        val output = 0
        assertThat(output, `is`(equalTo(solution.reverse(input))))
    }
}