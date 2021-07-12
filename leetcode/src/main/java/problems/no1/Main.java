package problems.no1;

public class Main {

    public static void main(String[] args) {

        int[] nums = {3,4,5,2,6};
        int target = 5;

        int[] answer = new Solution().twoSum(nums,target);

        System.out.println(answer);
    }

}
