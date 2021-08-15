package problems.no8

class Solution {
    fun myAtoi(s: String): Int {
        val chars = s.toCharArray()
        return convertToInt(extractDigit(getIndexOfExtractDigit(chars) ?: return 0, chars))
    }

    private fun getIndexOfExtractDigit(chars: CharArray): Int? {
        for ((index, char) in chars.withIndex()) {
            if (isSign(char) || isDigit(char)) {
                return index
            }
            if (!isWhiteSpace(char)) {
                return null
            }
        }
        return null
    }

    private fun extractDigit(startIndex: Int, chars: CharArray): String {
        val digitList = ArrayList<Char>()
        val firstChar = chars[startIndex]
        val startIndex = if (isSign(firstChar)) startIndex + 1 else startIndex
        val sign = if (isSign(firstChar)) firstChar.toString() else "+"

        for (index in startIndex until chars.size) {
            val char = chars[index]
            if (!isDigit(char)) {
                break
            }
            digitList.add(char)
        }

        return sign.plus(digitList.joinToString(separator = ""))
    }

    private fun convertToInt(str: String): Int {
        if (str.length == 1 && isSign(str.first())) {
            return 0
        }
        if (str.isEmpty()) {
            return 0
        }
        return str.toIntOrNull() ?: if (str.first() == '+') Int.MAX_VALUE else Int.MIN_VALUE
    }

    private fun isSign(char: Char) = char == '+' || char == '-'
    private fun isDigit(char: Char) = char.isDigit()
    private fun isWhiteSpace(char: Char) = char.isWhitespace()


}