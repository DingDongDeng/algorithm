package problems.no7

import kotlin.math.absoluteValue
import kotlin.math.sign

class Solution {
    fun reverse(x: Int): Int {
        return x.sign * (x.absoluteValue.toString().reversed().toIntOrNull() ?: 0)
    }
}