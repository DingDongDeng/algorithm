package problems.no5;

import java.util.Objects;

class Solution {

    public String longestPalindrome(String s) {
        return new PalindromeExtractor().getLongestString(s);
    }

}


class PalindromeExtractor {

    public String getLongestString(String s) {
        String longestString = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                if (isPalindrome(str.toCharArray())) {
                    longestString = str.length() > longestString.length() ? str : longestString;
                }
            }
        }
        return longestString;
    }

    private boolean isPalindrome(char[] chars) {
        if (Objects.isNull(chars) || chars.length == 0) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (i > chars.length / 2) {
                break;
            }
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

}