package problems.no4;

import java.util.Stack;

class Solution {

    private final int EMPTY_VALUE = Integer.MAX_VALUE;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();

        int[] numsA = nums1;
        int[] numsB = nums2;
        int indexA = 0;
        int indexB = 0;
        int totalLength = numsA.length + numsB.length;
        int medianIndex = (totalLength / 2) - 1;
        boolean isOddLength = totalLength % 2 == 0;

        while (stack.size() < (medianIndex + 1) + 1) {

            int valueA = getValueByIndex(numsA, indexA);
            int valueB = getValueByIndex(numsB, indexB);

            if (isEmpty(valueA, valueB)) {
                return 0;
            }

            if (valueA > valueB) {
                stack.push(numsB[indexB++]);
            }

            if (valueA == valueB) {
                stack.push(numsA[indexA++]);
                stack.push(numsB[indexB++]);
            }

            if (valueA < valueB) {
                stack.push(numsA[indexA++]);
            }
        }

        while (stack.size() > (medianIndex + 1) + 1) {
            stack.pop();
        }

        if (isOddLength) {
            return (stack.pop() + stack.pop()) / 2.0;
        }

        return stack.pop();
    }

    private int getValueByIndex(int[] array, int index) {
        if (array.length == 0) {
            return EMPTY_VALUE;
        }

        if (array.length - 1 < index) {
            return EMPTY_VALUE;
        }

        return array[index];
    }

    private boolean isEmpty(int a, int b) {
        return a == EMPTY_VALUE && b == EMPTY_VALUE;
    }
}