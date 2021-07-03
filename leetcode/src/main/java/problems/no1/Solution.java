package problems.no1;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        List<Integer> sortedNumList = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
        List<Integer> filteredNumList = sortedNumList.subList(0, findStartOfNeedlessIndex(sortedNumList, target));
        NumberSet numberSet = makeNumberSet(filteredNumList, target);

        return convertNumberSetToIntArray(
            filteredNumList.get(numberSet.getIndex1()),
            filteredNumList.get(numberSet.getIndex2()),
            nums);
    }

    private int findStartOfNeedlessIndex(List<Integer> sortedNumList, int target) {
        for (int i = sortedNumList.size() - 1; i >= 0; i--) {
            int value = sortedNumList.get(i);
            if (value == target) {
                return i;
            }
            if (sortedNumList.get(i) < target) {
                return i + 1;
            }
        }

        throw new NoSuchElementException("Invalid target value : " + target);
    }

    private Integer findRemainValueIndex(List<Integer> filteredNumList, int remainValue) {
        for (int i = 0; i < filteredNumList.size(); i++) {
            int value = filteredNumList.get(i);
            if (value > remainValue) {
                break;
            }
            if (value == remainValue) {
                return i;
            }
        }

        return null;
    }

    private NumberSet makeNumberSet(List<Integer> filteredNumList, int target) {
        for (int i = filteredNumList.size() - 1; i >= 0; i--) {
            int remainValue = target - filteredNumList.get(i);
            Integer remainValudeIndex = findRemainValueIndex(filteredNumList, remainValue);
            if (Objects.nonNull(remainValudeIndex)) {
                return new NumberSet(remainValudeIndex, i);
            }
        }

        throw new NoSuchElementException("Can't find result");
    }

    private int[] convertNumberSetToIntArray(int value1, int value2, int[] nums) {
        int[] result = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value1 || nums[i] == value2) {
                result[index++] = i;
            }
            if (index == 2) {
                break;
            }
        }
        return result;
    }

    private class NumberSet {

        private int index1;
        private int index2;

        public NumberSet(int index1, int index2) {
            this.index1 = index1;
            this.index2 = index2;
        }

        public int getIndex1() {
            return index1;
        }

        public int getIndex2() {
            return index2;
        }
    }


}
