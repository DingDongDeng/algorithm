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
        int supplementConst = -1;
        boolean upDown = true; // zigzag direct , true is up, false is down
        for (int i = 0; i < chars.length; i++) {
            int temp = i % numRows;
            if (temp == 0 || temp == numRows - 1) {
                supplementConst++;
                upDown = !upDown;
            }

            if (upDown) {
                temp = (numRows - 1) - supplementConst;
            } else {
                temp = supplementConst + temp;
            }

            rowMap.get(temp).append(chars[i]);
        }
        return rowMap;
    }

//    private int getRowMapKey(int charsIndex) {
//        (charsIndex % numRows)
//    }


}


