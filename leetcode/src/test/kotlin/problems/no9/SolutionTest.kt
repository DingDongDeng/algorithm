package problems.no9

import org.junit.jupiter.api.Assertions.*

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution: Solution = Solution()

    @Test
    fun 테스트_케이스_1() {
        val input = 121
        val output = true
        assertThat(output, `is`(equalTo(solution.isPalindrome(input))))
    }

    @Test
    fun 테스트_케이스_2() {
        val input = -121
        val output = false
        assertThat(output, `is`(equalTo(solution.isPalindrome(input))))
    }

    @Test
    fun 테스트_케이스_3() {
        val input = 10
        val output = false
        assertThat(output, `is`(equalTo(solution.isPalindrome(input))))
    }

    @Test
    fun 테스트_케이스_4() {
        val input = -101
        val output = false
        assertThat(output, `is`(equalTo(solution.isPalindrome(input))))
    }

}