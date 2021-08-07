package problems.no6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {

    public String convert(String s, int numRows) {
        return new RowMap(s, numRows).makeZigZagString();
    }
}

class RowMap {

    private final Map<Integer, StringBuilder> rowMap;
    private final char[] chars;
    private final int numRows;

    public RowMap(String s, int numRows) {
        this.chars = s.toCharArray();
        this.numRows = numRows;
        this.rowMap = initRowMap(numRows);
    }

    public String makeZigZagString() {
        StringBuilder sb = new StringBuilder();
        for (Entry<Integer, StringBuilder> entry : rowMap.entrySet()) {
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    private Map<Integer, StringBuilder> initRowMap(int numRows) {
        return setRowMap(makeRowMap(numRows));
    }

    private Map<Integer, StringBuilder> makeRowMap(int numRows) {
        Map<Integer, StringBuilder> rowMap = new LinkedHashMap<>();
        for (int i = 0; i < numRows; i++) {
            rowMap.put(i, new StringBuilder());
        }
        return rowMap;
    }

    private Map<Integer, StringBuilder> setRowMap(Map<Integer, StringBuilder> rowMap) {
        int rowMapKey = -1;
        int count = 0;
        boolean isUp = false;
        for (int i = 0; i < chars.length; i++) {
            if (i != 0) {
                count++;
            }
            rowMapKey = isUp ? --rowMapKey : ++rowMapKey;
            rowMap.get(rowMapKey < 0 ? 0 : rowMapKey).append(chars[i]);
            if (count == numRows - 1) {
                isUp = !isUp;
                count = 0;
            }

        }
        return rowMap;
    }
}


