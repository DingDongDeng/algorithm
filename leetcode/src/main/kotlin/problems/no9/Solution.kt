package problems.no9

import java.util.*
import kotlin.math.sign

class Solution {
    /**
     * without integer to string
     */
    fun isPalindrome(x: Int): Boolean {
        if (x.sign < 0) {
            return false
        }
        val stack = Stack<Int>()

        var number = x
        while (number != 0) {
            stack.push(number % 10)
            number /= 10
        }

        var reversedNumber = 0
        var cipher = 1
        while (stack.isNotEmpty()) {
            reversedNumber += stack.pop() * cipher
            cipher *= 10
        }

        return reversedNumber == x
    }
}