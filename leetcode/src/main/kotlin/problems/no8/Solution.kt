package problems.no8

class Solution {
    fun myAtoi(s: String): Int {
        val digitList = ArrayList<Char>()
        var sign: String? = null
        var isStartExtractDigit = false

        for (char in s.toCharArray()) {
            if (isStartExtractDigit) {
                if (isDigit(char)) {
                    digitList.add(char)
                } else {
                    break
                }
            } else {
                if (isSign(char)) {
                    sign = char.toString()
                    isStartExtractDigit = true
                    continue
                }
                if (isDigit(char)) {
                    digitList.add(char)
                    isStartExtractDigit = true
                } else{
                    if(!isWhiteSpace(char)){
                        break
                    }
                }
            }
        }
        return convertToInt(sign, digitList.joinToString(separator = ""))
    }

    private fun isSign(char: Char) = char == '+' || char == '-'
    private fun isDigit(char: Char) = char.isDigit()
    private fun isWhiteSpace(char: Char) = char.isWhitespace()
    private fun convertToInt(sign: String?, str: String): Int {
        if (str.isEmpty()) {
            return 0
        }
        return (sign ?: "+").plus(str).toIntOrNull() ?: if (sign == "+" || sign == null) Int.MAX_VALUE else Int.MIN_VALUE
    }


}