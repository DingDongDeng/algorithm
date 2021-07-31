package problems.no5;

import java.util.Objects;

class Solution {

    public String longestPalindrome(String s) {
        return new PalindromeExtractor().getLongestString(s);
    }

}


class PalindromeExtractor {

    public String getLongestString(String s) {

        char[] chars = s.toCharArray();
        int startIndex = 0;
        int endIndex = -1;
        for (int i = 0; i < chars.length; i++) {
            for (int j = chars.length - 1; j >= i; j--) {
                int longestStringLength = endIndex - startIndex + 1;
                int length = j - i + 1;

                if (longestStringLength >= length) {
                    continue;
                }
                if (longestStringLength > length) {
                    continue;
                }

                if (isPalindrome(chars, i, j)) {
                    startIndex = i;
                    endIndex = j;
                }
            }
        }
        return s.substring(startIndex, endIndex + 1);
    }

    private boolean isPalindrome(char[] chars, int startIndex, int endIndex) {
        if (Objects.isNull(chars) || chars.length == 0) {
            return false;
        }
        for (int i = startIndex; i <= endIndex; i++) {
            if (chars[i] != chars[endIndex--]) {
                return false;
            }
        }

        return true;
    }

}