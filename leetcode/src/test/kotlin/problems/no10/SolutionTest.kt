package problems.no10

import org.junit.jupiter.api.Assertions.*

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution: Solution = Solution()

    @Test
    fun 테스트_케이스_1() {
        val s = "aa"
        val p = "a"
        val output = false
        assertThat(output, `is`(equalTo(solution.isMatch(s, p))))
    }

    @Test
    fun 테스트_케이스_2() {
        val s = "aa"
        val p = "a*"
        val output = true
        assertThat(output, `is`(equalTo(solution.isMatch(s, p))))
    }

    @Test
    fun 테스트_케이스_3() {
        val s = "ab"
        val p = ".*"
        val output = true
        assertThat(output, `is`(equalTo(solution.isMatch(s, p))))
    }

    @Test
    fun 테스트_케이스_4() {
        val s = "aab"
        val p = "c*a*b"
        val output = true
        assertThat(output, `is`(equalTo(solution.isMatch(s, p))))
    }

    @Test
    fun 테스트_케이스_5() {
        val s = "mississippi"
        val p = "mis*is*p*."
        val output = false
        assertThat(output, `is`(equalTo(solution.isMatch(s, p))))
    }


}