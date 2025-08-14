package Sorting;
public class bubble_sort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 1, 2};
        Sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void Sort(int[] nums) {
        for (int turn = 1; turn < nums.length; turn++) {
            for (int i = 0; i < nums.length - turn; i++) {  // Adjusted inner loop boundary
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }
}
