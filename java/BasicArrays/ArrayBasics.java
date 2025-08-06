import java.util.Arrays;

public class ArrayBasics {

    public static void linearSearch(int num[], int target) {
        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] == target) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void largestElement(int[] nums) {

        int largest = nums[0];
        for (int i = 0; i <= nums.length - 1; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        System.out.println(largest);
    }

    public static void secondLargestElementApproachOne(int[] nums) {
        if (nums.length < 2) System.out.println(-1);

        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                System.out.println(nums[i - 1]);
            }
        }
        System.out.println(-1);
    }

    public static void secondLargestElementApproachTwo(int[] nums) {
        int largest = nums[0];
        int slargest = -1;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
            } else if (nums[i] > slargest && nums[i] != largest) {
                slargest = nums[i];
            }
        }

        System.out.println(slargest);
    }

    public static void maxConsequtiveOnes(int[] nums) {
        int maxCount = 0;
        int localCount = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 1) {
                localCount++;
                maxCount = Math.max(maxCount, localCount);
            } else {
                localCount = 0;
            }
        }

        System.out.println(maxCount);
    }

    public static void main(String[] args) {

        int[] a = {5, 4, 10, 8, 2, 7};
//        linearSearch(a, 6);
//        largestElement(a);
//        secondLargestElementApproachTwo(a);
        maxConsequtiveOnes(new int[]{1, 1, 0, 0, 0, 1, 1, 1});
    }

}
