package Practice_Java;

public class product_of_arr_except_itself {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length;
        //left array
        int[] left = new int[n]; 
        left[0] = 1;
        for (int i=1; i<n; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        //right array
        int[] right = new int[n];
        right[n-1] = 1;
        for (int i=n-2; i>=0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }

        //loop time
        for (int i=0; i<n; i++) {
            nums[i] = left[i] * right[i]; 
            System.out.print(nums[i]+" ");
        }
    }
    
}
