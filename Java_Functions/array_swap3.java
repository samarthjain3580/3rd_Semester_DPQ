package Java_Functions;

public class array_swap3 {
    public static void main(String[] args) {
        int[]arr = {3,5,1,7,8};
		int[] other = {31,51,11,71,81};
		System.out.println(arr[0] + " " + other[0]);
		Swap(arr,other,0, 0);
		System.out.println(arr[0] + " " + other[0]);
	}
	public static void Swap(int[] arr, int[] other, int i, int j) {
		int temp =arr[i];
		arr[i]=other[j];
		other[j]=temp;
    }    
}
