package problems.no9

import kotlin.math.sign

class Solution {
    /**
     * without integer to string
     */
    fun isPalindrome(x: Int): Boolean {
        if (x.sign < 0) {
            return false
        }
        var number = x
        var reversed = 0
        while (number != 0) {
            reversed = (reversed * 10) + (number % 10)
            number /= 10
        }

        return reversed == x
    }
}