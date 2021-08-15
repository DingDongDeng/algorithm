package problems.no8

import org.junit.jupiter.api.Assertions.*

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution: Solution = Solution()

    @Test
    fun 테스트_케이스_1() {
        val input = "42"
        val output = 42
        assertThat(output, `is`(equalTo(solution.myAtoi(input))))
    }

    @Test
    fun 테스트_케이스_2() {
        val input = "   -42"
        val output = -42
        assertThat(output, `is`(equalTo(solution.myAtoi(input))))
    }

    @Test
    fun 테스트_케이스_3() {
        val input = "4193 with words"
        val output = 4193
        assertThat(output, `is`(equalTo(solution.myAtoi(input))))
    }

    @Test
    fun 테스트_케이스_4() {
        val input = "words and 987"
        val output = 0
        assertThat(output, `is`(equalTo(solution.myAtoi(input))))
    }

    @Test
    fun 테스트_케이스_5() {
        val input = "-91283472332"
        val output = -2147483648
        assertThat(output, `is`(equalTo(solution.myAtoi(input))))
    }

    @Test
    fun 테스트_케이스_6() {
        val input = "21474836460"
        val output = 2147483647
        assertThat(output, `is`(equalTo(solution.myAtoi(input))))
    }

}