import java.util.*;

public class educative_7 {

    public static boolean findSumOfThree(int[] nums, int target) {

        Arrays.sort(nums);
        int left, right, sum;

        for (int i = 0; i < nums.length - 2; i++) {
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                sum = nums[left] + nums[i] + nums[right];
                if (sum == target) {
                    return true;
                } else if (sum < left) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        int[][] numsList = { { 3, 7, 1, 2, 8, 4, 5 },
                { -1, 2, 1, -4, 5, -3 },
                { 2, 3, 4, 1, 7, 9 },
                { 1, -1, 0 },
                { 2, 4, 2, 7, 6, 3, 1 } };

        int[] testList = { 10, 7, 20, -1, 8 };

        for (int i = 0; i < testList.length; i++) {
            System.out.print(i + 1);
            System.out.println(".\tInput array: " + Arrays.toString(numsList[i]));

            if (findSumOfThree(numsList[i], testList[i])) {
                System.out.println("\tSum for " + testList[i] + " exists ");
            } else {
                System.out.println("\tSum for " + testList[i] + " does not exist ");
            }

            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }

}
