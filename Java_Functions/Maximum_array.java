package Java_Functions;

public class Maximum_array {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,7,9,8};
		System.out.println(Maximum1(arr));
	}
	
	public static int Maximum1(int[] arr) {
		int max = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int Maximum2(int[] arr) {
		int max = Integer.MIN_VALUE;//-2^31
		for (int i=0; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;        
    }   
}
