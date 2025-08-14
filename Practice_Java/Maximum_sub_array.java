package Practice_Java;

public class Maximum_sub_array {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Maximum_sum(nums));

    }
    
    public static int Maximum_sum(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}
