package problems.no5;

import problems.no5.PalindromeExtractor.ExtractorType;

class Solution {

    public String longestPalindrome(String s) {

        PalindromeExtractor palindromeExtractor = new PalindromeExtractor();

        String evenLengthStr = palindromeExtractor.getString(s, ExtractorType.EVEN);
        String oddLengthStr = palindromeExtractor.getString(s, ExtractorType.ODD);

        return evenLengthStr.length() > oddLengthStr.length() ? evenLengthStr : oddLengthStr;
    }

}


class PalindromeExtractor {

    public String getString(String s, ExtractorType extractorType) {
        return extractorType == ExtractorType.EVEN ? getEvenLengthString(s) : getOddLengthString(s);
    }

    private String getEvenLengthString(String s) {
        return "";
    }

    private String getOddLengthString(String s) {
        return "";
    }

    public enum ExtractorType {
        ODD, EVEN;
    }
}