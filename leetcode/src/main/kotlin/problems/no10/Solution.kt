package problems.no10

class Solution {
    fun isMatch(s: String, p: String): Boolean {
        return p.toRegex().matches(s)
    }
}