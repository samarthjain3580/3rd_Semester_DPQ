package Java_Functions;

public class Minimum_array {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,7,9,8};
		System.out.println(Minimum1(arr));
	}
	
	public static int Minimum1(int[] arr) {
		int min = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int Minimum2(int[] arr) {
		int min = Integer.MAX_VALUE;            // (2^31)-1
		for (int i=0; i<arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		return min;
    }
}
